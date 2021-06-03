package lesson5.online;

import lesson5.online.backpack.Backpack;
import lesson5.online.stuff.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class RecursionTest {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Raise 3 to the power of 0: " + raiseNumberToThePowerOf(3, 0));
        System.out.println("Raise 5 to the power of 1: " + raiseNumberToThePowerOf(5, 1));
        System.out.println("Raise 2 to the power of 2: " + raiseNumberToThePowerOf(2, 2));
        System.out.println("Raise 4 to the power of 3: " + raiseNumberToThePowerOf(4, 3));
        System.out.println("Raise 6 to the power of 4: " + raiseNumberToThePowerOf(6, 4));
        System.out.println("Raise 5 to the power of -1: " + raiseNumberToThePowerOf(5, -1));
        System.out.println("Raise 2 to the power of -2: " + raiseNumberToThePowerOf(2, -2));
        System.out.println("Raise 10 to the power of -3: " + raiseNumberToThePowerOf(10, -3));
        System.out.println("Raise 4 to the power of -2: " + raiseNumberToThePowerOf(4, -2));
        System.out.println();

        Backpack backPack = new Backpack(7);
        List<Stuff> stuffs = new ArrayList<>();
        stuffs.add(new Book());
        stuffs.add(new Binoculars());
        stuffs.add(new FirstAidKit());
        stuffs.add(new Laptop());
        stuffs.add(new Pot());
        System.out.print("Backpack maximum weight: ");
        System.out.println(backPack.getMaxWeight());
        System.out.println("Stuff to choose: ");
        Stream.of(stuffs).forEach(System.out::println);
        System.out.println();
        System.out.print("Best cost set: ");
        generateAllSets(backPack, stuffs);
        System.out.println(backPack.getBestPrice());
        System.out.print("Best set weight: ");
        System.out.println(backPack.calculateWeight(backPack.getBestItems()));
        System.out.print("Best set: " + backPack.GetBestSet());
    }

    //    1. Написать программу по возведению числа в степень с помощью рекурсии.
    private static double raiseNumberToThePowerOf(int number, int power) {
        if (power == 0) {
            return 1;
        }
        return power > 0 ? number * raiseNumberToThePowerOf(number, power - 1) : 1 / (number * raiseNumberToThePowerOf(number, -power - 1));
    }

    //    2. Написать программу «Задача о рюкзаке» с помощью рекурсии.
    private static void generateAllSets(Backpack backpack, List<Stuff> stuffs) {
        if (stuffs.size() > 0)
            checkSet(backpack, stuffs);
        for (int i = 0; i < stuffs.size(); i++) {
            List<Stuff> newList = new ArrayList<>(stuffs);
            newList.remove(i);
            generateAllSets(backpack, newList);
        }
    }

    private static void checkSet(Backpack backpack, List<Stuff> stuffs) {
        if (backpack.getBestItems() == null) {
            if (backpack.calculateWeight(stuffs) <= backpack.getMaxWeight()) {
                backpack.setBestItems(stuffs);
                backpack.setBestPrice(backpack.calculateCost(stuffs));
            }
        } else {
            if (backpack.calculateWeight(stuffs) <= backpack.getMaxWeight() && backpack.calculateCost(stuffs) > backpack.getBestPrice()) {
                backpack.setBestItems(stuffs);
                backpack.setBestPrice(backpack.calculateCost(stuffs));
            }
        }
    }
}

package lesson5.online;

import lesson5.online.backpack.Backpack;
import lesson5.online.stuff.*;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Stream;

public class RecursionTest {

    private static final Set<Stuff> MAXIMUM_COST_SELECTION = new LinkedHashSet<>();
    private static Stuff pos;

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
        System.out.println(backPack.toString());
        System.out.println();
        Stuff[] stuffs = {new Book(), new Binoculars(), new FirstAidKit(), new Laptop(), new Pot()};
        System.out.println("Stuff to choose: ");
        Stream.of(stuffs).forEach(System.out::println);

        System.out.println();
        System.out.print("Maximum cost set: ");
        System.out.println(getMaximumCostStuff(backPack, stuffs));
        System.out.println("Summary cost: " + getCurrentPrice(MAXIMUM_COST_SELECTION));
        System.out.println("Summary weight: " + MAXIMUM_COST_SELECTION.stream().mapToInt(Stuff::getWeight).sum());

    }

    //    1. Написать программу по возведению числа в степень с помощью рекурсии.
    private static double raiseNumberToThePowerOf(int number, int power) {
        if (power == 0) {
            return 1;
        }
        return power > 0 ? number * raiseNumberToThePowerOf(number, power - 1) : 1 / (number * raiseNumberToThePowerOf(number, -power - 1));
    }

    //    2. Написать программу «Задача о рюкзаке» с помощью рекурсии.
    private static Set<Stuff> getMaximumCostStuff(Backpack backPack, Stuff[] stuffs) {
        pos = stuffs[0];
        getSelection(backPack, stuffs);
        return MAXIMUM_COST_SELECTION;
    }

    private static void getSelection(Backpack backPack, Stuff[] stuffs) {

        for (int i = 0; i < stuffs.length; i++) {
            if ((backPack.getCurrentWeight() + stuffs[i].getWeight()) <= backPack.getMaximumWeight()) {
                backPack.addStuff(stuffs[i]);
            } else {
                break;
            }
        }

        if (getCurrentPrice(MAXIMUM_COST_SELECTION) < getCurrentPrice(backPack.getCurrentStuff())) {
            MAXIMUM_COST_SELECTION.clear();
            MAXIMUM_COST_SELECTION.addAll(backPack.getCurrentStuff());
        }
        backPack.removeAllStuff();

        rotate(stuffs);
        if (pos.equals(stuffs[0])) {
            return;
        }
        getSelection(backPack, stuffs);
    }

    private static void rotate(Stuff[] stuffs) {
        Stuff tmp;
        tmp = stuffs[0];
        System.arraycopy(stuffs, 1, stuffs, 0, stuffs.length - 1);
        stuffs[stuffs.length - 1] = tmp;
    }

    private static int getCurrentPrice(Set<Stuff> stuffSet) {
        return stuffSet.stream().mapToInt(Stuff::getCost).sum();
    }
}

package lesson2.online;

import lesson2.online.arraylist.Array;
import lesson2.online.arraylist.ArrayImpl;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class FillAndSort {

    private static final Random RANDOM = new Random();
    private static final int DIMENSION = 10_000;

    public static void main(String[] args) {

        Array<Integer> array1 = new ArrayImpl<>(DIMENSION);
        Array<Integer> array2 = new ArrayImpl<>(DIMENSION);
        Array<Integer> array3 = new ArrayImpl<>(DIMENSION);
        fillWithRandomNumbers(array1);
        copyContent(array1, array2);
        copyContent(array1, array3);

        long start, end;

        System.out.println("Bubble sort:");
        start = System.nanoTime();
        array1.sortBubble();
        end = System.nanoTime();
        System.out.println("Duration in milliseconds: " + TimeUnit.NANOSECONDS.toMillis(end - start));
        System.out.println();

        System.out.println("Select sort:");
        start = System.nanoTime();
        array2.sortSelect();
        end = System.nanoTime();
        System.out.println("Duration in milliseconds: " + TimeUnit.NANOSECONDS.toMillis(end - start));
        System.out.println();

        System.out.println("Insert sort:");
        start = System.nanoTime();
        array3.sortInsert();
        end = System.nanoTime();
        System.out.println("Duration in milliseconds: " + TimeUnit.NANOSECONDS.toMillis(end - start));
        System.out.println();
    }

    private static void fillWithRandomNumbers(Array<Integer> array) {
        for (int i = 0; i < DIMENSION; i++) {
            array.add(RANDOM.nextInt(DIMENSION));
        }
    }

    private static void copyContent(Array<Integer> source, Array<Integer> destination) {
        for (int i = 0; i < source.size(); i++) {
            destination.add(source.get(i));
        }
    }
}

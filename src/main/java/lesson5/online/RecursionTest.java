package lesson5.online;

public class RecursionTest {

    public static void main(String[] args) {

        System.out.println("Raise 3 to the power of 0: " + raiseNumberToThePowerOf(3, 0));
        System.out.println("Raise 5 to the power of 1: " + raiseNumberToThePowerOf(5, 1));
        System.out.println("Raise 2 to the power of 2: " + raiseNumberToThePowerOf(2, 2));
        System.out.println("Raise 4 to the power of 3: " + raiseNumberToThePowerOf(4, 3));
        System.out.println("Raise 6 to the power of 4: " + raiseNumberToThePowerOf(6, 4));
        System.out.println("Raise 5 to the power of -1: " + raiseNumberToThePowerOf(5, -1));
        System.out.println("Raise 2 to the power of -2: " + raiseNumberToThePowerOf(2, -2));
        System.out.println("Raise 10 to the power of -3: " + raiseNumberToThePowerOf(10, -3));
        System.out.println("Raise 4 to the power of -2: " + raiseNumberToThePowerOf(4, -2));
    }

    //    1. Написать программу по возведению числа в степень с помощью рекурсии.
    private static double raiseNumberToThePowerOf(int number, int power) {
        if (power == 0) {
            return 1;
        }
        return power > 0 ? number * raiseNumberToThePowerOf(number, power - 1) : 1 / (number * raiseNumberToThePowerOf(number, -power - 1));
    }
}

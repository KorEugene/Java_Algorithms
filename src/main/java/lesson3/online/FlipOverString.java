package lesson3.online;

import lesson3.online.stack.Stack;
import lesson3.online.stack.StackImpl;

public class FlipOverString {

    public static void main(String[] args) {

        String example1 = "Hello world!";
        System.out.println(flipOverString(example1));
        String example2 = "Good morning!";
        System.out.println(flipOverString(example2));
        String example3 = "The color of orange is orange!";
        System.out.println(flipOverString(example3));
    }

    //     2. Создать программу, которая переворачивает вводимые строки (читает справа налево).
    private static String flipOverString(String source) {
        Stack<Character> stack = new StackImpl<>(source.length());
        for (Character character : source.toCharArray()) {
            stack.push(character);
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}

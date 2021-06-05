package lesson6.online;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestBinaryTree {

    private static final Random RANDOM = new Random();
    private static final int MAX_DEPTH = 4;
    private static final int UPPER_BOUND = 25;
    private static final int LOWER_BOUND = -25;
    private static final int TREES_COUNT = 20;

    public static void main(String[] args) {

        int maxNodes = raiseNumberToThePowerOf(2, MAX_DEPTH) - 1;

        List<Tree<Integer>> trees = new ArrayList<>(TREES_COUNT);
        for (int i = 0; i < TREES_COUNT; i++) {
            trees.add(generateTreeWithLimit(maxNodes));
        }

        int balancedCount = 0;
        int unbalancedCount = 0;
        for (Tree<Integer> tree : trees) {
            boolean result = isBalanced(tree.getRoot());
            if (result) {
                balancedCount++;
            } else {
                unbalancedCount++;
            }
        }

        int balanced = (int) ((double) balancedCount / TREES_COUNT * 100);
        int unbalanced = (int) ((double) unbalancedCount / TREES_COUNT * 100);
        System.out.println("Trees balanced: " + balanced + "%. Trees unbalanced: " + unbalanced + "%.");

    }

    private static Tree<Integer> generateTreeWithLimit(int maxNodes) {
        Tree<Integer> treeWithLimitedDepth = new TreeImpl<>(MAX_DEPTH);
        for (int i = 0; i < maxNodes; i++) {
            treeWithLimitedDepth.add(randInt(LOWER_BOUND, UPPER_BOUND));
        }
        return treeWithLimitedDepth;
    }

    private static int randInt(int min, int max) {
        return RANDOM.nextInt((max - min) + 1) + min;
    }

    private static int raiseNumberToThePowerOf(int number, int power) {
        if (power == 0) {
            return 1;
        }
        return power > 0 ? number * raiseNumberToThePowerOf(number, power - 1) : 1 / (number * raiseNumberToThePowerOf(number, -power - 1));
    }

    public static boolean isBalanced(Node node) {
        return (node == null) ||
                isBalanced(node.getLeftChild()) &&
                        isBalanced(node.getRightChild()) &&
                        Math.abs(height(node.getLeftChild()) - height(node.getRightChild())) <= 1;
    }

    private static int height(Node node) {
        return node == null ? 0 : 1 + Math.max(height(node.getLeftChild()), height(node.getRightChild()));
    }
}

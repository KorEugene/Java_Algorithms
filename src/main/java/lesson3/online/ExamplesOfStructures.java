package lesson3.online;

import lesson3.online.queue.PriorityQueue;
import lesson3.online.queue.Queue;
import lesson3.online.queue.QueueImpl;
import lesson3.online.stack.Stack;
import lesson3.online.stack.StackImpl;

public class ExamplesOfStructures {

    public static void main(String[] args) {

        Stack<Integer> stack = new StackImpl<>(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        while (!stack.isEmpty()) {
            System.out.println("From stack: " + stack.pop());
        }

        Queue<Integer> queue = new QueueImpl<>(5);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);

        while (!queue.isEmpty()) {
            System.out.print("Queue before remove: ");
            queue.display();
            System.out.println("Peek: " + queue.peekFront());
            queue.remove();
            System.out.print("Queue after remove: ");
            queue.display();
            System.out.println();
        }

        Queue<Integer> priorityQueue = new PriorityQueue<>(5);
        priorityQueue.insert(1);
        priorityQueue.insert(2);
        priorityQueue.insert(3);
        priorityQueue.insert(4);
        priorityQueue.insert(5);

        while (!priorityQueue.isEmpty()) {
            System.out.print("PriorityQueue before remove: ");
            priorityQueue.display();
            priorityQueue.remove();
            System.out.print("PriorityQueue after remove: ");
            priorityQueue.display();
            System.out.println();
        }
    }
}

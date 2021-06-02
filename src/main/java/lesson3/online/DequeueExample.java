package lesson3.online;

import lesson3.online.dequeue.Dequeue;
import lesson3.online.dequeue.DequeueImpl;

public class DequeueExample {

    public static void main(String[] args) {

        Dequeue<Integer> dequeue = new DequeueImpl<>(10);
        dequeue.insertRight(1);
        System.out.print("Dequeue after insertRight: ");
        dequeue.display();
        dequeue.insertRight(2);
        System.out.print("Dequeue after insertRight: ");
        dequeue.display();
        dequeue.insertRight(3);
        System.out.print("Dequeue after insertRight: ");
        dequeue.display();
        dequeue.insertRight(4);
        System.out.print("Dequeue after insertRight: ");
        dequeue.display();
        dequeue.insertRight(5);
        System.out.print("Dequeue after insertRight: ");
        dequeue.display();
        dequeue.insertRight(6);
        System.out.print("Dequeue after insertRight: ");
        dequeue.display();
        dequeue.insertRight(7);
        System.out.print("Dequeue after insertRight: ");
        dequeue.display();
        dequeue.insertRight(8);
        System.out.print("Dequeue after insertRight: ");
        dequeue.display();
        System.out.println("Dequeue size: " + dequeue.size());
        System.out.println("Head at value: " + dequeue.peekFront());
        System.out.println("Tail at value: " + dequeue.peekBack());
        System.out.println();

        dequeue.removeLeft();
        System.out.print("Dequeue after removeLeft: ");
        dequeue.display();
        dequeue.removeLeft();
        System.out.print("Dequeue after removeLeft: ");
        dequeue.display();
        System.out.println("Dequeue size: " + dequeue.size());
        System.out.println("Head at value: " + dequeue.peekFront());
        System.out.println("Tail at value: " + dequeue.peekBack());
        System.out.println();

        dequeue.removeRight();
        System.out.print("Dequeue after removeRight: ");
        dequeue.display();
        dequeue.removeRight();
        System.out.print("Dequeue after removeRight: ");
        dequeue.display();
        System.out.println("Dequeue size: " + dequeue.size());
        System.out.println("Head at value: " + dequeue.peekFront());
        System.out.println("Tail at value: " + dequeue.peekBack());
        System.out.println();

        dequeue.insertLeft(9);
        System.out.print("Dequeue after insertLeft: ");
        dequeue.display();
        dequeue.insertLeft(10);
        System.out.print("Dequeue after insertLeft: ");
        dequeue.display();
        System.out.println("Dequeue size: " + dequeue.size());
        System.out.println("Head at value: " + dequeue.peekFront());
        System.out.println("Tail at value: " + dequeue.peekBack());
    }
}

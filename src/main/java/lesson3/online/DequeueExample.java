package lesson3.online;

import lesson3.online.dequeue.Dequeue;
import lesson3.online.dequeue.DequeueImpl;

public class DequeueExample {

    public static void main(String[] args) {

        Dequeue<Integer> dequeue = new DequeueImpl<>(10);
        dequeue.insert(1);
        dequeue.insert(2);
        dequeue.display();
        dequeue.remove();
        dequeue.display();

        dequeue.insertLeft(3);
        dequeue.display();

    }
}

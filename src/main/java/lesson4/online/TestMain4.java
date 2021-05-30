package lesson4.online;

import lesson4.online.linkedlist.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestMain4 {

    public static void main(String[] args) {
//        testLinkedList();
        testForEach();
//        testLinkedQueue();
        testLinkedDequeue();
    }

    private static void testLinkedList() {
//        LinkedList<Integer> linkedList = new SimpleLinkedListImpl<>();
        TwoSideLinkedList<Integer> linkedList = new TwoSideLinkedListImpl<>();
        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertFirst(4);
        linkedList.insertLast(5);
//
        linkedList.display();
//
        System.out.println("Find 2: " + linkedList.contains(2));
        System.out.println("Find 1: " + linkedList.contains(1));
        System.out.println("Find 4: " + linkedList.contains(4));
        System.out.println("Find 4444: " + linkedList.contains(4444));
//
        linkedList.removeFirst();
        linkedList.remove(2);

        linkedList.display();
    }

    private static void testLinkedQueue() {
        LinkedQueueImpl<Integer> linkedQueue = new LinkedQueueImpl<>();
        linkedQueue.insert(1);
        linkedQueue.insert(2);
        linkedQueue.insert(3);
        linkedQueue.insert(4);

        linkedQueue.display();

        linkedQueue.remove();

        linkedQueue.display();
    }

    private static void testLinkedDequeue() {
        LinkedDequeueImpl<Integer> linkedDequeue = new LinkedDequeueImpl<>();
        linkedDequeue.insert(1);
        linkedDequeue.insert(2);
        linkedDequeue.insert(3);

        linkedDequeue.display();

        linkedDequeue.remove();

        linkedDequeue.display();

        linkedDequeue.insertLeft(4);
        linkedDequeue.insertLeft(5);

        linkedDequeue.display();

        linkedDequeue.removeRight();

        linkedDequeue.display();
    }

    private static void testForEach() {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        for (int i = 0; i < arrayList.size(); i++) {
            int value = arrayList.get(i);
        }

//        LinkedList<Integer> linkedListJava = new LinkedList<>();
//        linkedListJava.addFirst(1);
//        linkedListJava.addFirst(2);
//        linkedListJava.addLast(3);
//        linkedListJava.addLast(4);

//        SimpleLinkedListImpl<Integer> linkedList = new SimpleLinkedListImpl<>();
//        linkedList.insertFirst(1);
//        linkedList.insertFirst(2);
//        linkedList.insertFirst(3);
//        linkedList.insertFirst(4);
//
//        LinkedList.Node<Integer> currentNode = linkedList.firstElement;
//        while (currentNode != null) {
//            int value = currentNode.item;
//            currentNode = currentNode.next;
//        }



        for (Integer integer : arrayList) {
            System.out.println(integer);
        }
//
//        System.out.println("----");
//
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println(value);
        }
//
        LinkedList<Integer> linkedList = new SimpleLinkedListImpl<>();
        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertFirst(4);

        linkedList.display();

        for(Integer value: linkedList) {
            System.out.println(value);
        }
    }
}

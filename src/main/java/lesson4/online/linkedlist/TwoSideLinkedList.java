package lesson4.online.linkedlist;

public interface TwoSideLinkedList<E> extends LinkedList<E> {

    void insertLast(E value);

    E getLast();
}

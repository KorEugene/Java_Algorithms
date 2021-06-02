package lesson4.online.linkedlist;

import lesson3.online.dequeue.Dequeue;

public class LinkedDequeueImpl<E> implements Dequeue<E> {

    private final FullDirectionLinkedList<E> data;

    public LinkedDequeueImpl() {
        this.data = new FullDirectionLinkedListImpl<>();
    }

    @Override
    public boolean insertLeft(E value) {
        data.insertFirst(value);
        return true;
    }

    @Override
    public boolean insertRight(E value) {
        data.insertLast(value);
        return true;
    }

    @Override
    public E removeLeft() {
        return data.removeFirst();
    }

    @Override
    public E removeRight() {
        return data.removeLast();
    }

    @Override
    public boolean insert(E value) {
        return insertRight(value);
    }

    @Override
    public E remove() {
        return removeLeft();
    }

    @Override
    public E peekFront() {
        return data.getFirst();
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void display() {
        data.display();
    }

    @Override
    public E peekBack() {
        return data.getLast();
    }
}

package lesson4.online.linkedlist;

import lesson3.online.dequeue.Dequeue;

public class LinkedDequeueImpl<E> extends LinkedQueueImpl<E> implements Dequeue<E> {

    @Override
    public boolean insertLeft(E value) {
        data.insertFirst(value);
        return true;
    }

    @Override
    public E removeRight() {
        E removedValue = data.getLast();
        if (!isEmpty()) {
            data.remove(removedValue);
        }
        return removedValue;
    }

    @Override
    public E peekBack() {
        return data.getLast();
    }
}

package lesson3.online.dequeue;

import lesson3.online.queue.QueueImpl;

public class DequeueImpl<E> extends QueueImpl<E> implements Dequeue<E> {

    public DequeueImpl(int maxSize) {
        super(maxSize);
    }

    //    insertRight - это insert из queueImpl
    @Override
    public boolean insertLeft(E value) {
        if (isFull()) {
            return false;
        }

        if (head == 0) {
            head = data.length;
        }

        data[--head] = value;
        size++;

        return true;
    }

    //    removeLeft - это remove из queueImpl
    @Override
    public E removeRight() {
        if (isEmpty()) {
            return null;
        }

        if (tail == -1) {
            tail = data.length - 1;
        }

        E value = data[tail--];
        size--;

        return value;
    }

    @Override
    public E peekBack() {
        return data[tail];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null || i < head && i > tail || i < head && i < tail || i > head && i > tail) {
                continue;
            }
            sb.append(data[i]).append(", ");
        }
        sb.setLength(sb.length() - 2);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public void display() {
        System.out.println(this);
    }
}

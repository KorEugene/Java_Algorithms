package lesson3.online.dequeue;

import lesson3.online.queue.QueueImpl;

public class DequeueImpl<E> extends QueueImpl<E> implements Dequeue<E>  {

    public DequeueImpl(int maxSize) {
        super(maxSize);
    }

    @Override
    public boolean insertLeft(E value) {
        if (isFull()) {
            return false;
        }

        /*if (head == data.length - 1) {
            head = TAIL_DEFAULT;
        }*/

        data[++head] = value;
        size++;

        return true;
    }

    @Override
    public E removeRight() {
        if (isEmpty()) {
            return null;
        }

        /*if (head == data.length) {
            head = HEAD_DEFAULT;
        }*/

        E value = data[head++];
        size--;

        return value;
    }
}

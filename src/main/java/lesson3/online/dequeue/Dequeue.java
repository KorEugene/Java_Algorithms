package lesson3.online.dequeue;

import lesson3.online.queue.Queue;

public interface Dequeue<E> extends Queue<E> {

    boolean insertRight(E value);

    boolean insertLeft(E value);

    E removeLeft();

    E removeRight();

    E peekBack();
}

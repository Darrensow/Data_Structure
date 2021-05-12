package Week7.Lab;

public class MyQueue<E> {
    protected java.util.LinkedList<E> list = new java.util.LinkedList<>();

    //Copy an existing array of elements into the queue
    public MyQueue(E[] e) {
        if (e == null) {
            throw new IllegalArgumentException("Array is empty!");
        }
        for (int i = 0; i < e.length; i++) {
            enqueue(e[i]);
        }
    }

    //Default constructor
    public MyQueue() { }

    public void enqueue(E e) {
        if (e == null) {
            throw new IllegalArgumentException("Cannot insert null elements into the queue!");
        }
        this.list.addLast(e);
    }

    public E dequeue() {
        if (list.size() == 0) {
            throw new IllegalArgumentException("Queue is empty");
        }
        return this.list.removeFirst();
    }

    public E getElement(int i) {
        if (list.size() == 0) {
            throw new IllegalArgumentException("Queue is empty");
        }
        return this.list.get(i);
    }

    public E peek() {
        if (list.size() == 0) {
            throw new IllegalArgumentException("Queue is empty");
        }
        return this.list.peekFirst();
    }

    public int getSize() {
        return this.list.size();
    }

    public boolean contains(E e) {
        if (e == null) {
            throw new IllegalArgumentException("Element is null");
        }
        return this.list.contains(e);
    }

    public boolean isEmpty() {
        return this.list.size() == 0;
    }

    @Override
    public String toString() {
        return "Queue: " + this.list.toString();
    }
}

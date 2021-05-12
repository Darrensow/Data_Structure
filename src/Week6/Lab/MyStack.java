package Week6.Lab;

import java.util.ArrayList;

public class MyStack<E> {
    private ArrayList<E> list;

    /**
     * Creates an empty array list
     */
    public MyStack() {
        this(new ArrayList<>());
    }

    /**
     * Assigns an existing ArrayList to list
     * @param list Existing ArrayList
     */
    public MyStack(ArrayList<E> list) {
        this.list = list;
    }

    public void push(E e) {
        list.add(e);
    }

    public E pop() {
        return list.remove(list.size() - 1);
    }

    public E peek() {
        return list.get(list.size() - 1);
    }

    public int getSize() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.size() == 0; //true if == 0, false otherwise
    }

    public String toString() {
        return "Stack: " + list.toString();
    }

    public boolean search(E e) {
        return list.contains(e);
    }
}

package Week6.Lab;

import Week4.Lab.MyLinkedList;

import java.util.EmptyStackException;
import java.util.Iterator;

public class StackWithSLL<E> {
    private Week4.Lab.MyLinkedList<E> stack = new Week4.Lab.MyLinkedList<>();

    public StackWithSLL() { }

    public StackWithSLL(E e) {
        stack.addLast(e);
    }

    public boolean isEmpty() {
        return stack.getSize() == 0;
    }

    public void push(E e) {
        stack.addLast(e);
    }

    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeLast();
    }

    public E peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.peekLast();
    }

    @Override
    public String toString() {
        return stack.toString();
    }
}

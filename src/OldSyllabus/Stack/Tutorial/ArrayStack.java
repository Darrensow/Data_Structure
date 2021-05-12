package OldSyllabus.Stack.Tutorial;
@SuppressWarnings("Unchecked cast")
public class ArrayStack<T> {
    private T[] stackArray;
    private static final int MAX_STACK_CAPACITY = 10;
    private int size;

    public ArrayStack() {
        this.stackArray = (T[]) new Object[MAX_STACK_CAPACITY];
    }


}

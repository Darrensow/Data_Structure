package OldSyllabus.Stack;

public class Stack<T> {
    private ListNode<T> head;

    public Stack() {
        this.head = null;
    }

    public boolean isEmpty(){
        return this.head == null;
    }

    public int getSize(){
        int count = 0;
        ListNode<T> current = head;
        while (current != null) {
            current = current.getLink();
            count++;
        }
        return count;
    }

    public void push(T e) {
        if (e == null) {
            throw new IllegalArgumentException("Cannot insert null object");
        }
        this.head = new ListNode<>(e, head);
    }

    public T pop() {
        if (head == null) {
            return null;
        }
        T temp = this.head.getData();
        this.head.setData(null); //set the element to null
        this.head = this.head.getLink(); //reference to the next object in the stack
        return temp;
    }

    public T peek() {
        if (head == null) {
            return null;
        } else {
            return this.head.getData();
        }
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
        } else {
            ListNode<T> current = head;
            while (current != null) {
                System.out.println(current.toString());
                current = current.getLink();
            }
        }
    }
}

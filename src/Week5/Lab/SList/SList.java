package Week5.Lab.SList;

public class SList<E> {
    private SNode<E> head;
    private SNode<E> tail;
    private int size;


    public SList() {
    }

    /**
     * Append a new element at the end of the list
     * @param e
     */
    public void appendEnd(E e) {
        if (tail == null) { // if the list is empty (size == 0) || (head == null)
            head = tail = new SNode<>(e);
        } else {
            tail.next = new SNode<>(e);
            tail = tail.next;
        }
        size++;
    }

    /**
     * Eliminate the first element in the list
     * @return
     */
    public E removeInitial() {
        if (size == 0) {
            return null;
        } else {
            SNode<E> temp = head;
            head = head.next;
            size--;
            if (head == null) {
                tail = null;
            }
            return temp.element;
        }
    }

    /**
     * Search for an element and returns true if this list contains the searched element
     * @param e element to be checked
     * @return true if element is found, else false
     */
    public boolean contains(E e) {
        SNode<E> current = head;
        for (int i = 0; i < size; i++) {
            if (current.element == e) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    /**
     * Empty all elements in the list and return a statement that reports that the list is empty.
     */
    public void clear() {

        //another method, but this is not that full-proof...
//        head = tail = null;
//        size = 0; //resets the number of nodes in the list

        while (size > 0) { //removes elements from the list if there are more elements present in the list
            removeInitial();
        }
        System.out.println("All elements are cleared from the list. The list is now empty");
    }

    /**
     * Display all values from the list in a successive order.
     */
    public void display() {
        if (size == 0) {
            System.out.println("[]");
        } else {
            SNode<E> current = head;
            System.out.print("List : [");
            for (int i = 0; i < size; i++) {
                System.out.print(current.element);
                current = current.next;
                if (i <= size && !(i == size - 1)) {
                    System.out.print(" ");
                }
            }
            System.out.println("]");
        }
    }
}

package Week5.Lab.Kindergarten;

public class LinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public LinkedList() {
    }

    /**
     * Add the student to the end of the student list
     * @param e New element to be added
     */
    public void add(E e) {
        if (tail == null) {
            head = tail = new Node<>(e);
        } else {
            tail.next =  new Node<>(e);
            tail = tail.next;
        }
        size++;
    }

    /**
     * Removes the matching element in the list
     * @param e Matching element in the list
     */
    public void removeELement(E e) {
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            if (current.element.equals(e)) {
                remove(i);
            }
            current = current.next;
        }
    }


    /**
     * Traverse through the list and print out all the elements in the format [, , , .]
     */
    public void printList() {
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            System.out.print(current.element);
            if (i < size && i != size - 1) {
                System.out.print(", ");
            }
            current = current.next;
        }
        System.out.println(".");
    }

    public int getSize() {
        return this.size;
    }

    /**
     * Checks whether the element passed in is inside the list
     * @param e element to be checked
     * @return True if the list contains the element e, else false
     */
    public boolean contains(E e) {
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            if (current.element.equals(e)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    /**
     *
     * @param index index of the element ot be replaced
     * @param newE the new element
     */
    public void replace(int index, E newE) {
        if (index < 0 || index >= size) {
            return;
        } else if (index == 0) {
            head.element = newE;
        } else if (index == size - 1) {
            tail.element = newE;
        } else {
            Node<E> current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.element = newE;
        }
    }

    /**
     * Recieves the element 'e' to be replaced with 'newE'
     * This method iterate through the list and checks for all matching e, to be replaced with newE
     * @param e element to be replaced
     * @param newE new element to replace the old element
     */
    public void replace(E e, E newE) {
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            if (current.element.equals(e)) {
                current.element = newE;
            }
            current = current.next;
        }
    }

    private E remove(int index) {
        if (index < 0 || index >= size) {
            return null;
        } else if (index == 0) {
            return removeFirst();
        } else if (index == size - 1) {
            return removeLast();
        } else {
            Node<E> previous = head;
            for (int i = 1; i < index; i++) {
                previous = previous.next;
            }
            Node<E> current = previous.next;
            previous.next = current.next;
            size--;
            return current.element;
        }
    }

    private E removeFirst() {
        if (size == 0) {
            return null;
        } else {
            Node<E> temp = head;
            head = head.next;
            size--;
            if (head == null) {
                tail = null;
            }
            return temp.element;
        }
    }

    private E removeLast() {
        if (size == 0) {
            return null;
        } else if (size == 1) {
            Node<E> temp = head;
            head = tail = null;
            size = 0;
            return temp.element;
        } else {
            Node<E> current = head;
            for (int i = 0; i < size - 2; i++) {
                current = current.next;
            }
            Node<E> temp = tail;
            tail = current;
            tail.next = null;
            size--;
            return temp.element;
        }
    }


    /**
     * Get the index of the element e
     * @param e Element
     * @return Returns the index of the element. If the index is not found, returns -1.
     */
    private int indexOf(E e) {
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            if (current.element.equals(e)) {
                return i;
            }
            current = current.next;
        }
        return -1;
    }
}

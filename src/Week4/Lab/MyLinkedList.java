package Week4.Lab;

public class MyLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public MyLinkedList() {
    }

    public int getSize() {
        return size;
    }

    public void addFirst(E e){
        Node<E> newNode = new Node<>(e);
        newNode.next = head; // points the new node to the current head
        head = newNode; // assign the head to the newly declared node, making it the head
        size++;
        if (tail == null)
            tail = head;

    }

    public void addLast(E e) {
        if (tail == null) {
            head = tail = new Node<>(e);
        } else {
            tail.next = new Node<>(e);
            tail = tail.next;
        }
        size++;
    }

    public void add(int index, E e) {
        if (index == 0) {
            addFirst(e);
        } else if (index >= size) {
            addLast(e);
        } else {
            Node<E> current = head;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            Node<E> temp = current.next;
            current.next = new Node<E>(e);
            (current.next).next = temp;

        }
    }

    public E removeFirst() {
        if (size == 0) {
            return null;
        } else {
            Node<E> temp = head;
            head = head.next; // assigns the head reference variable to the new head
            size--;
            if (head == null) {
                tail = null;
            }
            return temp.element;
        }

    }

    public E removeLast(){
        if (size == 0) {
            return null;
        } else if (size == 1) { //only 1 node
            Node<E> temp = head;
            head = tail = null; //reset to know
            size = 0;
            return temp.element; //to know what we delete
        } else {
            Node<E> current = head;
            for (int i = 0; i < size - 2; i++) {
                current = current.next; //stop 1 node before tail
            }
            Node<E> temp = tail; //copy tail to temp b4 delete
            tail = current; //current become tail
            tail.next = null; //reset the next for tail // to be null
            size--;
            return temp.element;
        }

    }

    public E remove(int index) {
        if (index < 0 || index >= size) return null; // to delete index of node not in range
        else if (index == 0) return removeFirst(); //call removeFirst
        else if (index == size - 1) return removeLast(); //call removeLast <- removes the last element
        else {
            Node<E> previous = head; //Set head to be previous
            for (int i = 1; i < index; i++) {
                previous = previous.next; // stop before index that want to be deleted
            }
            Node<E> current = previous.next; //copy previous.next to current
            previous.next = current.next; //set new point to from previous.next to current.next
            size--; //reduce size
            return current.element;
        }
    }

    public void add(E e) {
        addLast(e);
    }

    public boolean contains(E e) {
        Node<E> pointerB = head;
        for(int i = 0; i<size; i++) {
            if (pointerB.element == e) {
                System.out.println(pointerB.element);
                return true;
            }
            pointerB = pointerB.next;
        }
        return false;
    }

    public E get(int index){
        if (index >= size) {
            throw new IndexOutOfBoundsException("Index is out of the size of the list");
        }
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.element;
    }

    public E getFirst() {
        return head.element;
    }

    public E getLast() {
        return tail.element;
    }

    public int indexOf(E e) {
        Node<E> current = head;
        for (int i = 0; i < size - 1; i++) {
            if (current.element == e) {
                return i;
            }
            current = current.next;
        }
        return -1;
    }

    public int lastIndexOf(E e) {
        Node<E> current = head;
        int lastIndex = -1;
        for (int i = 0; i < size - 1; i++) {
            if (current.element == e) {
                lastIndex = i;
            }
            current = current.next;
        }
        return lastIndex;
    }

    public E set(int index, E e) {
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        E replacedElement = current.element;
        current.element = e;
        return replacedElement;
    }

    /* Ignore this code - replaces the node with another node
    public E set(int index, E e) {
        Node<E> current = head;
        if (index == 0) {

//            Node<E> nextElement = current.next; //refer to the next Element in the list
//            head = new Node<>(e); //assigns the new node to the head
//            head.next = nextElement; // points the next of the head to the next element in the list
            E tempElement = removeFirst();
            addFirst(e);
            return tempElement;

        } else if (index == size - 1) {

            E tempElement = removeLast();
            addLast(e);
            return tempElement;

        } else if (index > 0 && index < size - 1) {

            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            Node<E> temp = current.next; //store the element to be removed
            current.next = new Node<>(e); // connect the current node to the node to be replaced
            (current.next).next = temp.next; //connect the replaced node's next node reference to the following node
            return temp.element;

        } else {
            return null;
        }
    }
     */


    //clear out the list
    public void clear() {
        head = tail = null;
    }

    public void print(){
        System.out.print("Elements in the list = [");
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            System.out.print(current.element);
            current = current.next;
            if (i < size && i != size - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]\n");
    }

    public void reverse() {
        E[] elementsArray = (E[]) new Object[size];
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            elementsArray[i] = current.element;
            current = current.next;
        }
        System.out.print("Elements in the list in reverse order = [");
        for (int i = elementsArray.length - 1; i >= 0 ; i--) {
            System.out.print(elementsArray[i]);
            if (i > 0 && i != 0) {
                System.out.print(", ");
            }
        }
        System.out.print("]\n");
    }

    public E getMiddleValue(){
        int middleIndex = size / 2;
        Node<E> current = head;
        for (int i = 0; i < middleIndex; i++) {
            current = current.next;
        }
        return current.element;
    }
}


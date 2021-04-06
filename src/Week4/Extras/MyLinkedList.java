package Week4.Extras;

public class MyLinkedList<E> {

    private Node<E> head = null;
    private Node<E> tail = null;
    protected int size = 0;

    public MyLinkedList() {
    }

    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e);
        newNode.next = head; //create pointer to current head
        head = newNode; //new node created & assigned to new head
        size++; //increase size
        if (tail == null) //no node exists
        {
            tail = head;
        }
    }

    public void addLast(E e) {
        if (tail == null) { //no node exist
            head = tail = new Node<>(e);
        } else {
            tail.next = new Node<>(e); //tail.next point to new Node
            tail = tail.next; //new tail updated from tail.next
        }
        size++;
    }

    public void add(E e) {
        if (tail == null) { //no node exist
            head = tail = new Node<>(e);
        } else {
            tail.next = new Node<>(e); //tail.next point to new Node
            tail = tail.next; //new tail updated from tail.next
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
            current.next = new Node<>(e);
            (current.next).next = temp;
            size++;
        }
    }

    public E removeFirst() {
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

    public E removeLast() {
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

    public E remove(int index) {
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

    //return true if the list contains the element e
    public boolean contains(E e) {
        Node<E> temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.element == e) {
                System.out.println(temp.element);
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

// return elements at the specified index
    public E get(int index) {
        Node<E> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.element;
    }
// return value of the first item;

    public E getFirst() {
        return head.element;
    }

// return valur of the last item;
    public E getLast() {
        Node<E> last = head;
        for (int i = 0; i < size - 1; i++) {
            last = last.next;
        }
        return last.element;
    }

// return the index of the head matching element in this list. return -1 of no match
    public int indexOf(E e) {
        Node<E> temp = head;
        for (int i = 0; i < size - 1; i++) {
            if (e == temp.element) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }
//Return the index of the last matching element in this list. Return -1 of no match

    public int lastindexOf(E e) {
        Node<E> temp = head;
        int index = -1;
        for (int i = 0; i < size - 1; i++) {
            if (e == temp.element) {
                index = i;
            }
            temp = temp.next;
        }
        return index;
    }

//   Replace the element at the specified position in this list with the specified element
    public E set(int index, E e) {
        Node<E> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        E remove_element = temp.element;
        temp.element = e;
        return remove_element;
    }

// clear the list
    public void clear() {
        head = tail = null;
    }

// print all the elements in the list
    public void print() {
        Node<E> print = head;
        for (int i = 0; i < size; i++) {
            System.out.println("element index of " + i + " : " + print.element);
            print = print.next;
        }
    }

// print all elements in reverse order
    public void reverse_print() {
        Node<E> current = head;
        Node<E> prev = null;
        Node<E> next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        for (int i = 0; i < size; i++) {
            System.out.println("element of index " + (size - i) + " : " + prev.element);
            prev = prev.next;
        }
    }

    public void reverse() {
        Node<E> temp = head;
        Node<E> current = head;
        Node<E> prev = null;
        Node<E> next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        tail = head;
        tail.next = null;
        head = prev;
    }

    public E getMiddleValue() {
        Node<E> result = head;
        for (int i = 0; i < size/2; i++) {
            result =result.next;
        }
        return result.element;
    }
}

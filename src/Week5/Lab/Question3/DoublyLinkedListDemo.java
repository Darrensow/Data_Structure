package Week5.Lab.Question3;

public class DoublyLinkedListDemo {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.addFirst(1);
        list.addLast(10);
        list.addLast(100);


        list.add(2, 2);
        list.remove(3);

        System.out.println();

        list.iterateForward();
        list.iterateBackward();

        System.out.println();

        System.out.println("Size of the Double Linked List : " + list.size());
        list.clear();
        System.out.println("Size of the Doubly Linked List : " + list.size());
    }
}

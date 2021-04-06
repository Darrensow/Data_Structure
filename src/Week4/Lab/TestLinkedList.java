package Week4.Lab;

public class TestLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Character> linkedList = new MyLinkedList<>();
        //a. appending the following
        Character[] charArray = {'a', 'b', 'c', 'd', 'e'};
        for (int i = 0; i < charArray.length; i++) {
            linkedList.add(charArray[i]);
        }

        //b. print all the elements in the list.
        linkedList.print();

        //c. reverse all the elements in the list
        linkedList.reverse();

        //display the middle value in the list
        printMiddleValue(linkedList);
        System.out.println();

        //d. Retrieve the number of elements in the list.
        System.out.println("Number of elements in the list : " + linkedList.getSize());
        System.out.println();

        //e. Retrieve the first and last value.
        System.out.println("First element : " + linkedList.getFirst());
        System.out.println("Last element : " + linkedList.getLast());
        System.out.println();

        //f. Delete the middle value.
        int middleIndex = linkedList.getSize() / 2;
        System.out.println("Element removed : " + linkedList.remove(middleIndex));
        linkedList.print();
        printMiddleValue(linkedList);
        System.out.println();

        //g. Retrieve the index location for the second and third value.
        System.out.println("Index location of b is " + linkedList.indexOf('b'));
        System.out.println("Index location of c is " + linkedList.indexOf('c'));
        linkedList.print();
        System.out.println();

        //h. Checks if the list has the value ‘c’.
        System.out.println("Does the list contains 'c'? Answer is " + linkedList.contains('c'));
        linkedList.print();
        System.out.println();

        //i. Replace the items individually with the following: h,e,l,l,o.
        Character[] replacedValue = {'h', 'e', 'l', 'l', 'o'};
        for (int i = 0; i < replacedValue.length - 1; i++) {
            linkedList.set(i, replacedValue[i]);
        }
        linkedList.add('o');
        linkedList.print();
        printMiddleValue(linkedList);

    }
    //Question 2 test
    public static void printMiddleValue(MyLinkedList linkedList){
        System.out.println();
        System.out.println("The middle value for the list is " + linkedList.getMiddleValue());

    }
}

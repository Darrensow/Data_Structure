package Week3.Lab;

public class ArrayBagDemo {
    public static void main(String[] args) {
        System.out.println("bag1:");
        BagInterface<String> bag1 = new ArrayBag<>();
        String[] contentsOfBag1 = {"A", "A", "B", "A", "C", "A"};
        testAdd(bag1, contentsOfBag1);
        displayBag(bag1);

        System.out.println();

        System.out.println("bag2:");
        BagInterface<String> bag2 = new ArrayBag<>();
        String[] contentsOfBag2 = {"A", "B", "A", "C", "B", "C", "D", "another string"};
        testAdd(bag2, contentsOfBag2);
        displayBag(bag2);

        System.out.println();

        System.out.println("bag3, test the method union of bag1 and bag2:");
        BagInterface<String> bag3 = bag1.union(bag2);
        displayBag(bag3);
        System.out.println();

        System.out.println("bag4, test the method intersection of bag1 and bag2:");
        BagInterface<String> bag4 = bag1.intersection(bag2);
        displayBag(bag4);
        System.out.println();

        System.out.println("bag5, test the method difference of bag1 and bag2:");
        BagInterface<String> bag5 = bag1.difference(bag2);
        displayBag(bag5);
        System.out.println();

//        BagInterface<Character> demo1 = new ArrayBag<>();
//        demo1.add('a');
//        demo1.add('b');
//        demo1.add('c');
//        BagInterface<Character> demo2 = new ArrayBag<>();
//        demo2.add('b');
//        demo2.add('b');
//        demo2.add('d');
//        demo2.add('e');
//
//        //Question 2
//        System.out.println("Question 2---");
//        BagInterface<Character> union = demo1.union(demo2);
//        Object[] unionArray = union.toArray(); //why when character, it gives us class cast exception?
//        for (int i = 0; i < union.getCurrentSize(); i++) {
//            System.out.print(unionArray[i]);
//        }
//
//        //Question 3
//        System.out.println("Question 3---");
//        BagInterface<Character> intersection = demo1.intersection(demo2);
//        Object[] intersectionArray = intersection.toArray();
//        for (int i = 0; i < intersection.getCurrentSize(); i++) {
//            System.out.print(intersectionArray[i] + " ");
//        }
//
//        System.out.println();
//        //Question 4
//        System.out.println("Question 4---");
//        BagInterface<Character> difference = demo2.difference(demo1);
//        Object[] differenceArray = difference.toArray();
//        for (int i = 0; i < differenceArray.length; i++) {
//            System.out.print(differenceArray[i] + " ");
//        }
//
//        System.out.println();
//        Object[] checkArray = demo2.toArray();
//        for (int i = 0; i < demo2.getCurrentSize(); i++) {
//            System.out.print(checkArray[i] + " ");
//        }
    }
    private static void testAdd(BagInterface<String> aBag, String[] content){
        System.out.print("Adding ");
        for (int i = 0; i < content.length; i++) {
            System.out.print(content[i] + " ");
            aBag.add(content[i]);
        }
        System.out.println();
    }

    private static void displayBag(BagInterface<String> aBag){
        System.out.println("The bag contains " + aBag.getCurrentSize() + " string(s), as follows:");
//        String[] contentsArray = aBag.toArray(); //this will throw a ClassCastException
        Object[] contentsArray = aBag.toArray();
        for (int i = 0; i < aBag.getCurrentSize(); i++) {
            System.out.print(contentsArray[i] + " ");
        }
        System.out.println();
    }
}

package Week7.Lab;

public class TestMyQueue {
    public static void main(String[] args) {
        //a. Have an initialize queue items consists of Durian and Blueberry in a fruitQ
        String[] strArray = {"Durian", "Blueberry"};
        MyQueue<String> fruitQ = new MyQueue<>(strArray);

        //b. Then add new items in the following order: Apple, Orange, Grapes, Cherry.
        System.out.println("\nAdding fruits to the queue");
        fruitQ.enqueue("Apple");
        fruitQ.enqueue("Orange");
        fruitQ.enqueue("Grapes");
        fruitQ.enqueue("Cherry");

        //c. Display the queue.
        System.out.println("\nDisplaying the queue");
        System.out.println(fruitQ.toString());

        //d. Show the top item.
        System.out.println("\nShowing the top item");
        System.out.println(fruitQ.peek());

        //e. Get the queue size.
        System.out.println("\nGetting the size of the queue");
        System.out.println("Size: " + fruitQ.getSize());

        //f. Delete Durian.
        System.out.println("\nDeleting durian");
        System.out.println(fruitQ.dequeue());

        //g. Get item in index position of 2
        System.out.println("\nGetting item at index 2");
        System.out.println("Item at index 2: " + fruitQ.getElement(2));

        //h. Check whether the queue consists of Cherry
        System.out.println("\nChecking if the queue has Cherry");
        System.out.println("Does the queue have cherry? " + fruitQ.contains("Cherry"));

        //i. Check whether the queue consists of Durian
        System.out.println("\nChecking if the queue has Durian");
        System.out.println("DOes the queue have Durian? " + fruitQ.contains("Durian"));

        //j. Display the queue using the isEmpty() condition.
        System.out.println("\nDisplaying the queue using the isEmpty() condition.");
        System.out.print("[ ");
        while (!fruitQ.isEmpty()) {
            System.out.print(fruitQ.dequeue() + " ");
        }
        System.out.println("]");
    }
}

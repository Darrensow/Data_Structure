package Week6.Lab;

import java.util.Scanner;

public class TestIntMyStack {
    public static void main(String[] args) {
        MyStack<Integer> intStack = new MyStack<>();

        //a
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter an INTEGER value: ");
        int input = s.nextInt();

        //b
        System.out.println("Pushing values 1 - " + input);
        for (int i = 1; i <= input; i++) {
            System.out.println("Pushing " + i);
            intStack.push(i);
        }

        //c
        System.out.println("Size of stack: " + intStack.getSize());

        //d
        System.out.println("Displaying contents repeatedly using pop()");
        System.out.print("[ ");
        while (!intStack.isEmpty()) {
            System.out.print(intStack.pop() + " ");
        }
        System.out.println("]");

        //Why is the order inverted?
        /**
         * Because the stack implements the Last In First Out (LIFO) concept.
         * The item at the top of the stack will be popped out first.
         * The item at the bottom of the stack will be popped out last.
         */


        //Question 3
        System.out.println();
        System.out.println("Test program for question 3");
        MyStack<Integer> intStack1 = new MyStack<>();
        System.out.println("Adding integers to the stack");
        intStack1.push(1);
        intStack1.push(4);
        intStack1.push(2);
        intStack1.push(8);

        System.out.println(intStack1.toString());
        System.out.println(sumOfInts(intStack1));
        System.out.println(intStack1.toString());
    }

    /**
     * Pops and integer and push it into a temporary stack
     * After calculating, pops back the integer back to the original stack
     * @param stack
     * @param <E> Type integer only
     * @return The sum of all the integers in the stack
     */
    public static <E extends Integer> int sumOfInts(MyStack<E> stack) {
        MyStack<E> tempStack = new MyStack<>(); //temp stack to store elements
        int sum = 0;
        //pop and store in a temporary stack
        while (!stack.isEmpty()) {
            sum += (int) stack.peek(); //add the integer to 'sum'
            tempStack.push(stack.pop());
        }
        //pops and push the integers back to the original stack
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
        return sum;
    }
}

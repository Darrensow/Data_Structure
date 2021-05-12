package OldSyllabus.Stack.Tutorial;

import OldSyllabus.Stack.LinkedListStack;

import java.util.Stack;

public class Tutorial5 {
    public static void main(String[] args) {
        //Question 2
        /*
        ArrayStack<Character> characterStack = new ArrayStack<>();
        System.out.println("Implementing the Array");
        System.out.println("Inserting three nodes into the stack");
        characterStack.push('A');
        characterStack.push('B');
        characterStack.push('C');
        characterStack.push('D');
        characterStack.push('E');
        characterStack.push('F');
        characterStack.push('G');
        characterStack.push('H');
        characterStack.push('I');
        characterStack.push('J');
        characterStack.showStack();
        System.out.println("The number of elements int hte stack is " + characterStack.getSize());
        System.out.println("Is the stack full? " + characterStack.isFull());

        System.out.println("Pop one node from the stack");
        System.out.println(characterStack.pop());
        characterStack.showStack();

        System.out.println("The element on the top of the stack is " + characterStack.peek());
        characterStack.showStack();
        System.out.println("The number of elements int hte stack is " + characterStack.getSize());
        System.out.println("Is the stack full? " + characterStack.isFull());


         */

        //Question 4 test
//        printFibNum(1);
//        printFibNum(5);
//        printFibNum(8);
//        printFibNum(14);

        solveParentheses("()");
        solveParentheses("())");
        solveParentheses("((()()))(())");
    }

    //Question4
    public static void printFibNum(int n) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        stack.push(1);
        int count = n;

        for (int i = 0; i < n-1; i++) { //total number of runs are (n-1) - as the first iteration is treated as starting point for the fibonacci sequence
            int a = stack.pop();
            int b = stack.pop();
            stack.push(a);
            stack.push(a + b);
            count--;
        }

        System.out.println("Fib(" + n + "): " + stack.peek());
    }
    public static void solveParentheses(String parentheses) {
        LinkedListStack<Character> question5 = new LinkedListStack<>();
        for (int i = 0; i < parentheses.length(); i++)
            question5.push(parentheses.charAt(i));

        int countCloseLeft = 0;
        int countCloseRight = 0;
        if (parentheses.charAt(0) == ')')
            System.out.println(parentheses + " is not balanced");
        else if (parentheses.charAt(parentheses.length() - 1) == '(')
            System.out.println(parentheses + " is not balanced");
        else {
            while (!question5.isEmpty()) {
                if (question5.pop() == '(')
                    countCloseRight++;
                else
                    countCloseLeft++;
            }
            if (countCloseRight == countCloseLeft)
                System.out.println(parentheses + " is balanced");
            else
                System.out.println(parentheses + " is not balanced");
        }
    }
}

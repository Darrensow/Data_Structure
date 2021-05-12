package Week6.Lab;

public class TestMyStack {
    public static void main(String[] args) {
        MyStack<Character> stack = new MyStack<>();
        //1
        System.out.println("Adding to the stack");
        stack.push('a');
        stack.push('b');
        stack.push('c');

        //2
        System.out.println("Printing the character stack");
        System.out.println(stack.toString());

        //3
        System.out.println("Checking if the stack has 'b'? " + stack.search('b'));

        //4
        System.out.println("Checking if the stack has 'k' " + stack.search('k'));

        System.out.println();

        MyStack<Integer> intStack = new MyStack<>();
        //1
        System.out.println("Adding to the stack");
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);

        //2
        System.out.println("Printing the integer stack");
        System.out.println(intStack.toString());

        //3
        System.out.println("Checking if the stack has '6'? " + intStack.search(6));

    }
}

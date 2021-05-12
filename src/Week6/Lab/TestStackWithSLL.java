package Week6.Lab;

public class TestStackWithSLL {
    public static void main(String[] args) {
        StackWithSLL<Character> stack = new StackWithSLL<>();
        stack.push('A');
        stack.push('B');
        stack.push('C');
        System.out.println(stack.toString());
        stack.pop();
        System.out.println(stack.toString());
        System.out.println("Peek: " + stack.peek());;
        stack.pop();
        System.out.println("Peek: " + stack.peek());;
        System.out.println(stack.toString());
        stack.push('0');
        stack.push('L');
        stack.push('9');
        System.out.println(stack.toString());
    }
}

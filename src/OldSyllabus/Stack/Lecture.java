package OldSyllabus.Stack;

import java.util.Stack;

public class Lecture {
    public static void main(String[] args) {
        System.out.println(infixToPostfix("A+B"));
        System.out.println(infixToPostfix("A+B*C+D"));
    }

    public static String infixToPostfix(String a) {
        String str = "";
        char c = ' ';
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < a.length(); i++) {
            if (Character.isLetterOrDigit(a.charAt(i))) {
                str += a.charAt(i);
            } else if (a.charAt(i) == '(') {
                stack.push(a.charAt(i));
            } else if (a.charAt(i) == ')') {
                c = stack.pop();
                while (c != '(') {
                    str += c;
                    c = stack.pop();
                }
            } else {
                if (!stack.isEmpty()) {
                    if (stack.peek() == '(') {
                        stack.push(a.charAt(i));
                    } else {
                        c = stack.peek();
                        while (getPriority(a.charAt(i)) <= getPriority(c)) {
                            str += stack.pop();
                            if (!stack.isEmpty()) {
                                c = stack.peek();
                                if (c == '(') {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        stack.push(a.charAt(i));
                    }
                }
                stack.push(a.charAt(i));
            }
        }
        while (!stack.isEmpty()) {
            str += stack.pop();
        }
        return str;
    }

    public static int getPriority(char a) {
        switch (a) {
            case '*':
            case '/':
            case '%':
                return 2;
            case '+':
            case '-':
                return 1;
            default:
                return 0;
        }

    }
}

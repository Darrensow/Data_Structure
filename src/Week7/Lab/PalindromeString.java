package Week7.Lab;

public class PalindromeString {
    public static void main(String[] args) {
        System.out.println(isPalindrome("level"));
        System.out.println(isPalindrome("12321"));
        System.out.println(isPalindrome("123"));
        System.out.println(isPalindrome("courage"));

    }

    public static <E extends Comparable> boolean isPalindrome(String str) {
        MyQueue<Character> queue = new MyQueue<>(); //store the characters of a string
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0 ; i--) { //queueing the characters to the string
            queue.enqueue(str.charAt(i));
        }
        while (!queue.isEmpty()) { //appending the elements from the queue
            sb.append(queue.dequeue());
        }
        return str.equals(sb.toString());
    }
}

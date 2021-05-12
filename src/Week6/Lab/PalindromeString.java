package Week6.Lab;

public class PalindromeString {
    public static void main(String[] args) {
        //deified  civic  radar
        String str1 = "deified";
        String str2 = "civic";
        String str3 = "action";
        String str4 = "12321";
        String str5 = "-123-";
        String str6 = "   ";
        String str7 = "-12321-";
        System.out.println(isPalindrome(str1));
        System.out.println(isPalindrome(str2));
        System.out.println(isPalindrome(str3));
        System.out.println(isPalindrome(str4));
        System.out.println(isPalindrome(str5));
        System.out.println(isPalindrome(str6));
        System.out.println(isPalindrome(str7));
    }

    /**
     * Method to check if a string is a palindrome string.
     * Returns an error message if the string length exceeds 15 characters
     * @param str String to be checked for palindrome properties
     * @return The description of the palindrome string
     */
    public static String isPalindrome(String str) {
        if (str.length() > 15) {
            return "String length exceeds 15 characters!";
        }
        MyStack<Character> charStack = new MyStack<>();
        for (int i = 0; i < str.length(); i++) {
            charStack.push(str.charAt(i));
        }
        String palindromeString = "";
        while (!charStack.isEmpty()) {
            palindromeString += charStack.pop();
        }
        return "Is '" + str + "' a palindrome string? " + str.equals(palindromeString);
    }
}

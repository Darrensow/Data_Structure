package Week5.Lab.SList;

public class TestSList {
    public static void main(String[] args) {
        SList<String> sList = new SList<>();

        // 1. Append the following values individually: “Linked list, is, easy.”
        System.out.println("Appending values...");
        sList.appendEnd("Linked list");
        sList.appendEnd(", ");
        sList.appendEnd("is");
        sList.appendEnd(", ");
        sList.appendEnd("easy");
        sList.appendEnd(".");

        // 2. Display these values.
        System.out.println("Displaying values in the list");
        sList.display();
        System.out.println();

        // 3. Remove the word “Linked list” and display the removed value.
        System.out.println("Word removed : " + sList.removeInitial());
        System.out.println();

        // 4. Check if ‘difficult’ is in the list.
        System.out.println("Does the list contains 'difficult'? " + sList.contains("difficult"));
        System.out.println();

        // 5. Clear the list.
        sList.clear();
        System.out.println();
        System.out.println("Displaying list again : ");
        sList.display();
    }
}

package Week2.Tutorials;

public class MyArray {
    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3, 4, 5};
        String[] array2 = {"Jane", "Tom", "Bob"};
        Character[] array3 = {'a', 'b', 'c'};
        listAll(array1);
        listAll(array2);
        listAll(array3);
    }

    public static <E> void listAll(E[] e) {
        for (int i = 0; i < e.length; i++) {
            System.out.print(e[i] + " ");
        }
        System.out.println();
    }
}

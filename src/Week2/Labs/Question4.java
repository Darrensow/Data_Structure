package Week2.Labs;

public class Question4 {
    //main method
    public static void main(String[] args) {
        Integer[] intArray = {5,3,7,1,4,9,8,2};
        String[] strArray = {"red", "blue", "orange", "tan"};
        Integer[] int1 = {1}; //test array with one element
        Character[] charArray = {}; // test empty array
        System.out.println(minmax(intArray));
        System.out.println(minmax(strArray));
        System.out.println(minmax(int1));
//        System.out.println(minmax(charArray));
    }

    //Question 4
    public static <E extends Comparable<E>> String minmax(E[] eArray) {
        if (eArray.length < 1) {
            throw new IllegalArgumentException("Array length is insufficient to produce minimum and maximum values");
        }

        E min = eArray[0];
        E max = eArray[0];

        for (int i = 1; i < eArray.length; i++) {
            if (eArray[i].compareTo(max) > 0) {
                max = eArray[i];
            }
            if (eArray[i].compareTo(min) < 0) {
                min = eArray[i];
            }
        }

        return "Min = " + min + " | Max = " + max;
    }
}

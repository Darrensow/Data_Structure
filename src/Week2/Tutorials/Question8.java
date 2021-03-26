package Week2.Tutorials;

import java.util.ArrayList;

public class Question8 {
    public static void main(String[] args) {
        ArrayList<Integer> numOfCars = new ArrayList<>();
        ArrayList<Double> milesPerHour = new ArrayList<>();
        numOfCars.add(5);
        numOfCars.add(5);
        milesPerHour.add(20.1);
        printList(numOfCars);
        printList(milesPerHour);
    }

    public static void printList(ArrayList<?> e) {
        System.out.println(e.toString());
    }
//    public static <E> void printList(ArrayList<E> e) {
//        System.out.println(e.toString());
//    }
//    public static <E> void printList(E e) {
//        System.out.println(e.toString());
//    }
}

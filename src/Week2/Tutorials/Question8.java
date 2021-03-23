package Week2.Tutorials;

import java.util.ArrayList;

public class Question8 {
    public static void main(String[] args) {
        ArrayList<Integer> numOfCars = new ArrayList<>();
        ArrayList<Double> milesPerHour = new ArrayList<>();
        printList(numOfCars);
        printList(milesPerHour);
    }

    public static <E> void printList(ArrayList<?> e) {
        System.out.println(e.toString());
    }
}

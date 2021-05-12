package Week5.Lab.Kindergarten;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        LinkedList<String> studentList = new LinkedList<>();
//        studentList.add("Ahmat");
//        studentList.add("Fatyimah");
//        studentList.add("Alice");
//        System.out.println("Does the list contain Fatyimah? " + studentList.contains("Fatyimah"));
//        System.out.println("Does the list contain Fatimah? " + studentList.contains("Fatimah"));
//        System.out.println("Replacing Fatyimah with Fatimah ");
//        studentList.replace("Fatyimah", "Fatimah");
//        studentList.printList();
        inputNames(studentList);
        displayStudentNumber(studentList);
        checkNames(studentList);
        removeNames(studentList);
        System.out.println();
        System.out.println("All student data captured complete. Thank you!");
    }

    private static void inputNames(LinkedList list) {
        System.out.println("Enter your student name list. Enter 'n to end.....");
        while (true) {
            String name = s.nextLine();
            if (name.equals("n")) {
                break;
            } else {
                list.add(name);
            }
        }
        System.out.println();
        System.out.println("You have entered the following student's name: ");
        list.printList();
        System.out.println();
    }

    private static void displayStudentNumber(LinkedList list) {
        System.out.print("The number of students entered was " + list.getSize());
        System.out.println();
    }

    private static void checkNames(LinkedList list) {
        System.out.println("Were all the names entered correct? Enter 'r' to rename the student name, 'n' to proceed.");
        String input = s.nextLine();
        if (input.equals("r")) {
            System.out.println("Enter the existing student's name that you want to rename : ");
            String targetName = s.nextLine();
            System.out.println("Target name " + targetName);
            System.out.println();

            System.out.println("Enter the new name : ");
            String renamedName = s.nextLine();
            System.out.println("Renamed name " + renamedName);
            System.out.println();

            list.replace(targetName, renamedName);
            System.out.println("The new student list is : ");
            list.printList();

        }
    }

    private static void removeNames(LinkedList list) {
        System.out.println("Do you want to remove any of your student's name? Enter 'y' for yes, 'n' to proceed");
        String input = s.nextLine();
        if (input.equals("y")) {
            System.out.println();
            System.out.println("Enter a student name to remove : ");
            String targetName = s.nextLine();
            list.removeELement(targetName);
            System.out.println();

            displayStudentNumber(list);
            System.out.println("The update student list is : ");
            list.printList();
            System.out.println();
        }
    }
}

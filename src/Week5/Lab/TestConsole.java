package Week5.Lab;

import java.util.Scanner;

public class TestConsole {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double MIN_WAGE = 8; //declare the minimum wage
        double RATE = 1.5; //amount paid if working hours more than 40

        System.out.print("Enter the number of hours worked: ");
        int hoursWorked = s.nextInt(); //get the input from user, an integer value only
        double pay = 0;

        if (hoursWorked > 60) { // hoursWorked > 60
            System.out.println("Maximum hours a week is 60, working more than that won't earn extra wage");
            pay = 60 * MIN_WAGE * RATE;
            System.out.println("Pay: RM " + pay);
        } else if (hoursWorked > 40) { // 40 < hoursWorked <= 60
            System.out.println("Number of hours worked this week: " + hoursWorked);
            pay = hoursWorked * MIN_WAGE * RATE;
            System.out.println("Pay: RM " + pay);
        } else if (hoursWorked > 0) { // 0 < hoursWorked <= 40
            pay = hoursWorked * MIN_WAGE;
            System.out.println("Pay: RM " + pay);
        } else { // 0 < hoursWorked (negative integer - bad input)
            System.out.println("Invalid input");
        }
    }
}

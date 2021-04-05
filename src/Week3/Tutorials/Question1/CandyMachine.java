package Week3.Tutorials.Question1;

import java.util.Scanner;

public class CandyMachine {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        Dispenser[] dispensers = {new Dispenser("Candies", 19.99),
                new Dispenser("Chips", 9.99),
                new Dispenser("Gum", 4.99),
                new Dispenser("Cookies", 8.99)};
        while (true) {
            displayProductsSold(dispensers);
            int customerInput;
            do {
                System.out.print("Please choose an item by typing in the product number(1-4) : ");
                customerInput = s.nextInt();
            } while (customerInput > 5 || customerInput < 1 && dispensers[customerInput].hasStock());

            Dispenser selectedItem = dispensers[customerInput - 1];
            double amountPaid = 0;
            do {
                displayPrice(selectedItem, customerInput);
                System.out.print("Please key in the correct amount to pay : ");
                amountPaid += s.nextDouble();
                if (amountPaid < selectedItem.getItemPrice()) {
                    double amountNeeded = Math.round((selectedItem.getItemPrice() - amountPaid) * 100.0) / 100.0;
                    System.out.println("Not enough money. RM " + amountNeeded + " more needed");
                }
            } while (amountPaid < selectedItem.getItemPrice());

            double change = CashRegister.returnChange(amountPaid, selectedItem.getItemPrice());
            completePurchase(selectedItem, change);
        }
    }

    public static void displayProductsSold(Dispenser[] dispensers){
        for (int i = 0; i < dispensers.length; i++) {
            System.out.println("Product " + (i + 1));
            System.out.println(dispensers[i].toString());
            System.out.println("---------------------");
        }
    }

    public static void displayPrice(Dispenser item, int selections){
        String name = item.getItemName();
        double price = item.getItemPrice();
        System.out.println("Price of " + name + " : " + price);
    }

    public static void completePurchase(Dispenser selectedItem, double change){
        System.out.println("Your change : RM " + change);
        System.out.println("Purchase successful! Please come again");
        selectedItem.removeItem();
        System.out.println("Press enter to continue");
        s.nextLine();
        s.nextLine();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
}

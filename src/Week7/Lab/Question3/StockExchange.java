package Week7.Lab.Question3;

import java.util.Scanner;

public class StockExchange {
    static Scanner s = new Scanner(System.in); //reading inputs
    static MyQueueV2<Integer> shares = new MyQueueV2<>(); //store the queue for shares

    public static void main(String[] args) {
        while (true) {
            input();
        }
    }


    /*
    Buy 100 shares at $10 each
    Buy 50 shares at $20 each
    Sell 50 shares at $20 each
    Sell 60 shares at $30 each
    Sell 50 shares at #35 each
     */

    /**
     * Reads the input from the user following a specific format 'Buy/Sell x shares at $y each' and passes the values to buy() and sell() individually.
     */
    public static void input() {
        System.out.print("Enter your query: (In format 'Buy/Sell x shares at $y each'): ");
        String str = s.nextLine();
        if (str.equals("")) {
            System.out.println("Final " + shares.showProfits());
            System.exit(1);
        }
        String[] inputArray = str.split(" ");
        Integer price = Integer.valueOf(inputArray[4].substring(1)); //removes the '$' sign
        if (inputArray[0].equals("Buy")) {
            buy(Integer.valueOf(inputArray[1]), price);
        } else if (inputArray[0].equals("Sell")) {
            sell(Integer.valueOf(inputArray[1]), price);
        } else {
            System.out.println("Bad input, try again.");
        }
        System.out.println(shares.toString());
    }

    /**
     * Buy shares
     * @param share Number of shares bought
     * @param price Buying price of the share during buying
     */
    public static void buy(Integer share, Integer price) {
        System.out.println("Buying now...");
        shares.buyShares(share, price);
    }

    /**
     * Sell shares
     * @param share Number of shares sold
     * @param price Selling price of the share at during selling
     */
    public static void sell(Integer share, Integer price) {
        System.out.println("Selling the shares now...");
        shares.sellShares(share, price);
        System.out.println("Total " + shares.showProfits());;
    }
}

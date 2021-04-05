package Week3.Tutorials.Question1;

public class CashRegister {
    //assume infinite amount of money
    public static double returnChange(double amount, double itemPrice){
        double change = amount - itemPrice;
        return Math.round(change * 100.0) / 100.0;
    }
}

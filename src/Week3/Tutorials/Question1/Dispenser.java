package Week3.Tutorials.Question1;

public class Dispenser {
    private String itemName;
    private int itemStock;
    private double itemPrice;
    private static int ITEMSTOCK_DEFAULT = 100;

    public Dispenser(String itemName, int itemStock, double itemPrice) {
        this.itemName = itemName;
        this.itemStock = itemStock;
        this.itemPrice = itemPrice;
    }

    public Dispenser(String itemName, double itemPrice) {
        this(itemName, ITEMSTOCK_DEFAULT, itemPrice);
    }

    public String getItemName() {
        return itemName;
    }

    public int getItemStock() {
        return itemStock;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public boolean hasStock(){
        return itemStock > 0;
    }

    public boolean removeItem(){
        if (itemStock > 0) {
            this.itemStock--;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        String str = "Product : " + itemName;
        str += "\nPrice : " + itemPrice;
        str += "\nStock : " + itemStock;
        return str;
    }
}

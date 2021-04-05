package General.Exam;

//T - type of Item
//P - price of that item
public class Item<T, P> {
    private T itemName;
    private P itemPrice;

    public Item(T itemName, P itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public T getItemName() {
        return itemName;
    }

    public void setItemName(T itemName) {
        this.itemName = itemName;
    }

    public P getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(P itemPrice) {
        this.itemPrice = itemPrice;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemName=" + itemName +
                ", itemPrice=RM" + itemPrice +
                '}';
    }
}

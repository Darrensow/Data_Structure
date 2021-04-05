package General.Exam.LabTest1_Pua;

public class Item< T1,T2 extends Comparable<T2>> implements Comparable<Item> {

    protected T1 item_name;
    protected T2 item_price;

    public Item(T1 item_name, T2 item_price) {
        this.item_name = item_name;
        this.item_price = item_price;
    }

    public T1 getItem_name() {
        return item_name;
    }

    public T2 getItem_price() {
        return item_price;
    }

    @Override
    public String toString() {
        return "Item name: " + item_name + "\nItem price: " + item_price;
    }

    @Override
    public int compareTo(Item o) {
        return o.item_price.compareTo(this.item_price);
    }
}

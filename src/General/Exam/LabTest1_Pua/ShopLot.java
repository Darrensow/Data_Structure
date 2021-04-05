package General.Exam.LabTest1_Pua;

public class ShopLot extends Person {

    private String shopname;
    protected Person person;
    protected Item[] item_array = new Item[100];
    private int number = 0;

    public ShopLot(String shopname, Person person) {
        this.shopname = shopname;
        this.person = person;
    }

    public boolean add_item(Item item) {
        item_array[number] = item;
        number++;        
        return true;
    }    

    public String getShopname() {
        return shopname;
    }
    
    public String print_item() {
        String result="";
        for (int i = 0; i < item_array.length; i++) {
            if (item_array[i] == null) {
                break;
            }
            result += item_array[i].toString() + "\n";
        }
        return result;
    }

    public String toString() {
        String result = "Shopname: " + shopname + "\n" + person.toString() + "Storage: \n" + print_item();
        return result;
    }

    

}

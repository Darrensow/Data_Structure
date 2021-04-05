package General.Exam.LabTest1_Pua;

public class FashionStore<T1, T2 extends Comparable<T2>> extends ShopLot {

    protected Item<T1, T2> clothes;

    public FashionStore(String shopname, Person person) {
        super(shopname, person);
    }

    public void setMenu(T1 name, T2 price) {
        clothes = new Item<>(name, price);
        super.add_item(clothes);
    }

    public String toString() {
        return super.toString();
    }
    public int compareTo(FashionStore obj) {
        if (this.person.getNumber_employees() > obj.person.getNumber_employees()) {
            return 1;
        } else if (this.person.getNumber_employees() < obj.person.getNumber_employees()) {
            return -1;
        } else {
            return 0;
        }
    }

    public boolean equal(FashionStore obj) {
        if (this.person.getName_contact().equals(obj.person.getName_contact())) {
            return true;
        } else {
            return false;
        }
    }

}

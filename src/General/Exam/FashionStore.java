package General.Exam;

import java.util.Arrays;

public class FashionStore extends ShopLot{

    public FashionStore(String shopName, Person contactPerson, Person[] employees, Item[] menu) {
        super(shopName, contactPerson, employees, menu);
    }

    @Override
    public String toString() {
        return "FashionStore{" +
                "clothes=" + Arrays.toString(menu) +
                ", shopName='" + shopName + '\'' +
                ", contactPerson=" + contactPerson +
                ", Employees=" + Arrays.toString(Employees) +
                ", numOfEmployees=" + numOfEmployees +
                '}';
    }
}

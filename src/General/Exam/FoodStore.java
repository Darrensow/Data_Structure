package General.Exam;

import java.util.Arrays;

public class FoodStore extends ShopLot implements Comparable<FoodStore>{


    public FoodStore(String shopName, Person contactPerson, Person[] employees, Item[] menu) {
        super(shopName, contactPerson, employees, menu);
    }

    @Override
    public String toString() {
        return super.toString() +
                "menu=" + Arrays.toString(menu) +
                '}';
    }

    @Override
    public int compareTo(FoodStore o) {
        if (this.numOfEmployees > o.numOfEmployees) {
            return 1;
        } else if (this.numOfEmployees < o.numOfEmployees) {
            return -1;
        } else {
            return 0;
        }
    }

    //compare the name of the contact person
    @Override
    public boolean equals(Object obj) {
        if (obj == null) { //object not instantiated
            return false;
        }

        if (obj.getClass() != this.getClass()) { // object not same class
            return false;
        }

        final FoodStore other = (FoodStore) obj; // cast to FoodStore

        if (this.contactPerson.getName() == null || other.contactPerson.getName() == null) { // if one of the name is null
            return false;
        }

        if (!this.contactPerson.getName().equalsIgnoreCase(other.contactPerson.getName())) { // check same name
            return false;
        }
        return true;
    }
}

package General.Exam;

import java.util.Arrays;

public class ShopLot {
    protected String shopName;
    protected Person contactPerson;
    protected Person[] Employees;
    protected int numOfEmployees;
    protected Item[] menu;

    public ShopLot(String shopName, Person contactPerson, Person[] employees, Item[] menu) {
        this.shopName = shopName;
        this.contactPerson = contactPerson;
        this.Employees = employees;
        numOfEmployees = employees.length;
        this.menu = menu;
    }

    public Item[] getMenu() {
        return menu;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Person getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(Person contactPerson) {
        this.contactPerson = contactPerson;
    }

    public Person[] getEmployees() {
        return Employees;
    }

    public void setEmployees(Person[] employees) {
        Employees = employees;
    }

    public int getNumOfEmployees() {
        return numOfEmployees;
    }

    public void setNumOfEmployees(int numOfEmployees) {
        this.numOfEmployees = numOfEmployees;
    }

    @Override
    public String toString() {
        return "ShopLot{" +
                "shopName='" + shopName + '\'' +
                ", contactPerson=" + contactPerson +
                ", Employees=" + Arrays.toString(Employees) +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

class Person {
    private String name;
    private String contactNumber;

    public Person(String name) {
        this.name = name;
        this.contactNumber = null;
    }

    public Person(String name, String contactNumber) {
        this.name = name;
        this.contactNumber = contactNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                '}';
    }
}

package General.Exam.LabTest1_Pua;//

public class ShoppingMall {

    public static void main(String[] args) {

// food shop
        String[] shop1_employee = {"Jack", "Jane"};
        Person shop1_person = new Person("Mike", "0101122334", shop1_employee);
        FoodStore<String, Integer> shop1 = new FoodStore<>("McDonalds", shop1_person);
        shop1.setMenu("Burger", 10);
        shop1.setMenu("Fried Chicken", 12);

        String[] shop2_employee = {"Adam", "Alex", "Andrew"};
        Person shop2_person = new Person("Max", "0112233445", shop2_employee);
        FoodStore shop2 = new FoodStore("Sushi Mentai", shop2_person);
        shop2.setMenu("Chicken Katsu Don", 15);
        shop2.setMenu("Ramen", 12);

        String[] shop3_employee = {"Lex", "Leon"};
        Person shop3_person = new Person("Mike", "0101122334", shop3_employee);
        FoodStore shop3 = new FoodStore("Waroeng Penyet", shop3_person);
        shop3.setMenu("Ayam Penyet", 10);

/// fashion shop        
        String[] shop4_employee = {"Kate", "Ken", "Kurt"};
        Person shop4_person = new Person("Nate", "0199988776S", shop4_employee);
        FashionStore shop4 = new FashionStore("Uniqlo", shop4_person);
        shop4.setMenu("Shirt", 80);
        shop4.setMenu("T-shirt", 60);

        String[] shop5_employee = {"Frank", "Felix"};
        Person shop5_person = new Person("Nick", "0195544332", shop5_employee);
        FashionStore shop5 = new FashionStore("Padini", shop5_person);
        shop5.setMenu("Blouse", 100);
        shop5.setMenu("Skirt", 80);

        String[] shop6_employee = {"Ron", "John"};
        Person shop6_person = new Person("Nicole", "0194433221", shop6_employee);
        FashionStore shop6 = new FashionStore("Mango", shop6_person);
        shop6.setMenu("Dress", 120);

// Print the details for Sushi Mentai and Mango.
        System.out.println(shop2.toString() + "\n");
        System.out.println(shop6.toString() + "\n");

//Print the shop name that have the highest number of employees for each “foodStore” and “fashionStore”. 
        ShopLot[] obj_array1 = {shop1, shop2, shop3};
        ShopLot[] obj_array2 = {shop4, shop5, shop6};
        ShopLot temp1 = highest_numberOfEmployees(obj_array1);
        ShopLot temp2 = highest_numberOfEmployees(obj_array2);
        System.out.println("Food store with highest number of employees: " + temp1.getShopname());
        System.out.println("Fashion store with highest number of employees: " + temp2.getShopname());

//Print if any of the food store is having the same or different contact person. 
        System.out.println("");
        System.out.print("The contact person for " + shop1.getShopname() + " and " + shop2.getShopname() + " is ");
        if (shop1.equal(shop2) == true) {
            System.out.println("the same");
        } else {
            System.out.println("different");
        }
        System.out.print("The contact person for " + shop1.getShopname() + " and " + shop3.getShopname() + " is ");
        if (shop1.equal(shop3) == true) {
            System.out.println("the same");
        } else {
            System.out.println("different");
        }
        System.out.print("The contact person for " + shop2.getShopname() + " and " + shop3.getShopname() + " is ");
        if (shop2.equal(shop3) == true) {
            System.out.println("the same");
        } else {
            System.out.println("different");
        }

//   Print which food store is having more employees, between Sushi Mentai and Waroeng Penyet   
        System.out.println("");
        if (shop2.compareTo(shop3) > 0) {
            System.out.println(shop2.getShopname() + " have more employees than " + shop3.getShopname());
        } else if (shop2.compareTo(shop3) < 0) {
            System.out.println(shop3.getShopname() + " have more employees than " + shop2.getShopname());
        } else {
            System.out.println(shop2.getShopname() + " have same employees with " + shop3.getShopname());
        }

// Print the most expensive item for McDonalds and Padini. 
        System.out.println("");
        System.out.println("The most expensive item in" + shop1.getShopname() + " is " + most_expensiveItem(shop1).getItem_name());
        System.out.println("The most expensive item in" + shop5.getShopname() + " is " + most_expensiveItem(shop5).getItem_name());
    }

//    Write a generic method to return the shoplot name the highest number of employees. 
//    Write a generic method to return the most expensive item in a shoplot
    public static <E extends ShopLot> ShopLot highest_numberOfEmployees(E[] obj) {
        int max = -1;
        ShopLot result = null;
        for (int i = 0; i < obj.length; i++) {
            if (obj[i].person.getNumber_employees() > max) {
                max = obj[i].person.getNumber_employees();
                result = obj[i];
            }
        }
        return result;
    }

    public static <T extends ShopLot> Item most_expensiveItem(T obj) {
        Item temp = obj.item_array[0];
        for (int i = 1; i < obj.item_array.length; i++) {
            if (obj.item_array[i] == null) {
                break;
            }
            if (temp.compareTo(obj.item_array[i]) > 0) {
                temp = obj.item_array[i];
            }
        }
        return temp;
    }

}

package General.Exam;


public class ShoppingMall {
    public static void main(String[] args) {
        // FOOD STORE ----------------------------------------------
        //McDonald's
        Person McdContactPerson = new Person("Mike", "01011223344");
        Person[] McdEmployees = {new Person("Jack"), new Person("Jane")};
        Item<String, Integer> McdMenu1 = new Item<>("Burger", 10);
        Item<String, Integer> McdMenu2 = new Item<>("Fried Chicken", 12);
        Item[] allMcdMenu = {McdMenu1, McdMenu2};
        ShopLot McDonalds = new FoodStore("McDonalds", McdContactPerson, McdEmployees, allMcdMenu);

        //Sushi Mentai
        Person SushiContactPerson = new Person("Max", "0112233445");
        Person[] SushiEmployees = {new Person("Adam"), new Person("Alex"), new Person("Andrew")};
        Item<String, Integer> SushiMenu1 = new Item<>("Chicken Katsu Don", 15);
        Item<String, Integer> SushiMenu2 = new Item<>("Ramen", 12);
        Item[] allSushiMenu = {SushiMenu1, SushiMenu2};
        ShopLot SushiMentai = new FoodStore("Sushi Mentai", SushiContactPerson, SushiEmployees, allSushiMenu);

        //Waroeng Penyet
        Person[] WaroengEmployees = {new Person("Lex"), new Person("Leon")};
        Item<String, Integer> WaroengMenu1 = new Item<>("Chicken Katsu Don", 15);
        Item[] allWaroengMenu = {WaroengMenu1};
        ShopLot WaroengPenyet = new FoodStore("Waroeng Penyet", McdContactPerson, WaroengEmployees, allWaroengMenu);


        // FASHION STORE ----------------------------------------------
        //Uniqlo
        Person UniqloContactPerson = new Person("Nate", "0199988776S");
        Item<String, Integer> UniqloItem1 = new Item<>("Shirt", 80);
        Item<String, Integer> UniqloItem2 = new Item<>("T-Shirt", 60);
        Person[] UniqloEmployees = {new Person("Kate"), new Person("Ken"), new Person("Kurt")};
        Item[] UniqloAllItems = {UniqloItem1, UniqloItem2};
        ShopLot Uniqlo = new FashionStore("Uniqlo", UniqloContactPerson, UniqloEmployees, UniqloAllItems);

        //Padini
        Person PadiniContactPerson = new Person("Nick", "0195544332");
        Item<String, Integer> PadiniItem1 = new Item<>("Blouse", 100);
        Item<String, Integer> PadiniItem2 = new Item<>("Skirt", 80);
        Person[] PadiniEmployees = {new Person("Frank"), new Person("Felix")};
        Item[] PadiniAllItems = {PadiniItem1, PadiniItem2};
        ShopLot Padini = new FashionStore("Padini", PadiniContactPerson, PadiniEmployees, PadiniAllItems);

        //Mango
        Person MangoContactPerson = new Person("Nicole", "0194433221");
        Item<String, Integer> MangoItem1 = new Item<>("Dress", 120);
        Person[] MangoEmployees = {new Person("Ron"), new Person("John")};
        Item[] MangoAllItems = {MangoItem1};
        ShopLot Mango = new FashionStore("Mango", MangoContactPerson, MangoEmployees, MangoAllItems);

        //array of foodStore
        ShopLot[] shopLots = {McDonalds, SushiMentai, WaroengPenyet};
        //array of fashionStore
        ShopLot[] shopLots1 = {Uniqlo, Padini, Mango};

        //printing out shoplot description
        System.out.println(SushiMentai.toString());
        System.out.println();
        System.out.println(Mango.toString());
        System.out.println();

        //printing out shop with the highest number of employees
        System.out.println("Food" + getHighestNumOfEmployees(shopLots));
        System.out.println("Fashion" +  getHighestNumOfEmployees(shopLots1));
        System.out.println();

        //comparing the contact person for different Food Stores
        System.out.println(compareContactPerson(McDonalds, SushiMentai));
        System.out.println(compareContactPerson(McDonalds, WaroengPenyet));
        System.out.println(compareContactPerson(SushiMentai, WaroengPenyet));
        System.out.println();

        //compare number of employees between Food Stores
        System.out.println(compareEmployeeNumbers(SushiMentai, WaroengPenyet));
        System.out.println();

        //compare between the most expensive item in the Shop Lot
        System.out.println(getMostExpensiveItem(McDonalds));
        System.out.println(getMostExpensiveItem(Padini));
    }

    public static <T extends ShopLot> String getHighestNumOfEmployees(T[] shopArray){
        if (shopArray.length == 0) {
            throw new IllegalArgumentException("ShopLot array cannot be zero(no number of employees to be compared with)");
        }
        ShopLot resultShopLot = null;
        int maxEmployees = -1;
        for (int i = 0; i < shopArray.length; i++) {
            if (shopArray[i].getNumOfEmployees() > maxEmployees) {
                maxEmployees = shopArray[i].getNumOfEmployees();
                resultShopLot = shopArray[i];
            }
        }
        String str = resultShopLot.getShopName() + " with " + resultShopLot.getNumOfEmployees() + " employee(s)";
        return " store with the highest number of employees is " + str;
    }

    public static <T extends ShopLot> String getMostExpensiveItem(T shop){
        if (shop == null) {
            throw new NullPointerException("Shop has not been opened(Initialised)");
        }
        Item[] items = shop.getMenu().clone();
        int highestPrice = -1;
        Item higestPriceItem = null;
        for (int i = 0; i < items.length; i++) {
            if ((int) items[i].getItemPrice() > highestPrice) {
                highestPrice = (int) items[i].getItemPrice();
                higestPriceItem = items[i];
            }
        }
        return "The most expensive item in " + shop.getShopName() + " is " + higestPriceItem.getItemName();
    }

    public static <T extends ShopLot> String compareContactPerson(T shop1, T shop2) {
        if (shop1 == null) {
            throw new NullPointerException(shop1.getShopName() + " has not opened(initialised) yet(");
        }
        if (shop2 == null) {
            throw new NullPointerException(shop2.getShopName() + " has not opened(initialised) yet(");
        }
        String firstShopContact = shop1.getContactPerson().getName();
        String secondShopContact = shop2.getContactPerson().getName();
        if (shop1.equals(shop2)) {
            return "The contact person for " + shop1.getShopName() + " and " + shop2.getShopName() + " is the same.";
        } else {
            return "The contact person for " + shop1.getShopName() + " and " + shop2.getShopName() + " is the different.";
        }
    }

    public static <T extends ShopLot> String compareEmployeeNumbers(T shop1, T shop2) {
        if (shop1 == null) {
            throw new NullPointerException(shop1.getShopName() + " has not opened(initialised) yet(");
        }
        if (shop2 == null) {
            throw new NullPointerException(shop2.getShopName() + " has not opened(initialised) yet(");
        }
        String firstShopContact = shop1.getContactPerson().getName();
        String secondShopContact = shop2.getContactPerson().getName();
        if (( (FoodStore) shop1).compareTo((FoodStore) shop2) > 0) {
            return shop1.getShopName() + " has more employee(s) than " + shop2.getShopName();
        } else if (( (FoodStore) shop1).compareTo((FoodStore) shop2) < 0) {
            return shop2.getShopName() + " has more employee(s) than " + shop1.getShopName();
        } else {
            return "Both Food Stores have the same number of employees.";
        }
    }
}

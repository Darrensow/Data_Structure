package Week2.Labs;

public class MyGeneric<E> {
    private E e;

    public MyGeneric() {
    }

    public MyGeneric(E e) {
        this.e = e;
    }

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }
}

//Tester program for Question 2
class TestQ2 {
    public static void main(String[] args) {
        MyGeneric<String> strObj = new MyGeneric<>("Java");
        MyGeneric<Integer> intObj = new MyGeneric<>(10);
        System.out.println("Value of strObj is " + strObj.getE());
        System.out.println("Value of intObj is " + intObj.getE());
    }
}

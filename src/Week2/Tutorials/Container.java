package Week2.Tutorials;


public class Container <T> {
    private T t;

    public Container() {
    }

    public void add(T t) {
        this.t = t;
    }

    public T retrieve() {
        return this.t;
    }

    public static void main(String[] args) {
        Container<Integer> cont1 = new Container<>();
        Container<String> cont2 = new Container<>();
        cont1.add(50);
        cont2.add("Java");
        System.out.println("First container object : " + cont1.retrieve());
        System.out.println("Second container object : " + cont2.retrieve());
    }
}

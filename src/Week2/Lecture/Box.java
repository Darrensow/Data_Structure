package Week2.Lecture;

import java.util.ArrayList;

public class Box<T> {
    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();

        integerBox.add(10);
        System.out.printf("Integer Value :%d\n\n", integerBox.get());
        integerBox.add(100);
        System.out.printf("Integer Value :%d\n\n", integerBox.get());
        stringBox.add(new String("Hello World"));
        integerBox.add(1000000);
        System.out.printf("Integer Value :%d\n\n", integerBox.get());

        System.out.printf("String Value :%s\n", stringBox.get());
    }
}

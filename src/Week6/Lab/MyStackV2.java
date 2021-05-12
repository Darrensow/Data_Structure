package Week6.Lab;

import java.util.ArrayList;

public class MyStackV2<E> extends MyStack{
    private String name;

    public MyStackV2(String name) {
        this.name = name;
    }

    public MyStackV2(ArrayList list, String name) {
        super(list);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String str = "Rod " + getName() + " " + super.toString();
        return str;
    }
}

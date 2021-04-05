package Week2.Labs;

import java.lang.reflect.Parameter;

public class StorePairGeneric<E extends Comparable<E>> implements Comparable<StorePairGeneric>{
    private E first, second;

    public StorePairGeneric(E first, E second) {
        this.first = first;
        this.second = second;
    }

    public E getFirst() {
        return first;
    }

    public E getSecond() {
        return second;
    }

    public void setPair(E first, E second) {
        this.first = first;
        this.second = second;
    }

    public String toString() {
        return "first = " + first + " second = " + second;
    }

    public boolean equals(StorePairGeneric o) {
        return this.first == o.first;
    }

    @Override
    public int compareTo(StorePairGeneric o) {
        return o.first.compareTo(this.first);
    }
}

class TestConsole {
    public static void main(String[] args) {
//        StorePairGeneric<Integer> a = new StorePairGeneric<>(6,4);
//        StorePairGeneric<Integer> b = new StorePairGeneric<>(2,2);
//        StorePairGeneric<Integer> c = new StorePairGeneric<>(6,3);
//        System.out.println(a.equals(c));
//        System.out.println(a.equals(b));
//        System.out.println(b.equals(c));
//        System.out.println(a.compareTo(c));
//        System.out.println(a.compareTo(b));
        Pair<Integer> test1 = new Pair<>(1,3);
        Pair<Integer> test2 = new Pair<>(1,2);
        Pair<CircleTest> test3 = new Pair<>(new CircleTest(15), new CircleTest(20));
        Pair<CircleTest> test4 = new Pair<>(new CircleTest(15), new CircleTest(5));
        System.out.println(test3.getFirst().compareTo(test3.getSecond()));
        System.out.println(test3.compareTo(test4));
    }
}

class CircleTest implements Comparable<CircleTest> {
    private double radius;

    public CircleTest(double radius) {
        this.radius = radius;
    }

    public CircleTest() {
        this(1);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "CircleTest{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public int compareTo(CircleTest o) {
        if (this.radius > o.radius) {
            return 1;
        } else if (this.radius < o.radius) {
            return -1;
        } else {
            return 0;
        }
    }

}

class Pair<T extends Comparable<T>> implements Comparable<Pair<T>>{
    private T first;
    private T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public void setPair(T first, T second){
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    @Override
    public int compareTo(Pair o) {
        return o.first.compareTo(this.first);
//        return this.first.compareTo(o.first);
    }
}
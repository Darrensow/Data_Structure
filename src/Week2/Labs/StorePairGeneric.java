package Week2.Labs;

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
        StorePairGeneric<Integer> a = new StorePairGeneric<>(6,4);
        StorePairGeneric<Integer> b = new StorePairGeneric<>(2,2);
        StorePairGeneric<Integer> c = new StorePairGeneric<>(6,3);
        System.out.println(a.equals(c));
        System.out.println(a.equals(b));
        System.out.println(b.equals(c));
        System.out.println(a.compareTo(c));
        System.out.println(a.compareTo(b));
        System.out.println(b.compareTo(c));
    }
}
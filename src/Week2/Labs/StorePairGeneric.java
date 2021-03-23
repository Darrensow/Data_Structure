package Week2.Labs;

public class StorePairGeneric<E> implements Comparable<StorePairGeneric<E>>{
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

    //how to override?
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    //how to override?
    @Override
    public int compareTo(StorePairGeneric<E> o) {
        return 0;
    }
}

class TestConsole {
    public static void main(String[] args) {
        StorePairGeneric<Integer> a = new StorePairGeneric<>(6,4);
        StorePairGeneric<Integer> b = new StorePairGeneric<>(2,2);
        StorePairGeneric<Integer> c = new StorePairGeneric<>(6,3);
        System.out.println(a.equals(c));;
    }
}
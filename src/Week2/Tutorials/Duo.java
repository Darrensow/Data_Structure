package Week2.Tutorials;

//Question 6
public class Duo <A, B> {
    private A first;
    private B second;

    public Duo(A first, B second) {
        this.first = first;
        this.second = second;
    }

}

class TestConsole {
    public static void main(String[] args) {
        Duo<String, Integer> object1 = new Duo<>("Java", 50);
        Duo<Double, Double> object2 = new Duo<>(50.0, 50.0);
    }
}

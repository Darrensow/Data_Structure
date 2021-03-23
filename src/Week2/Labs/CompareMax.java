package Week2.Labs;

public class CompareMax {
    //generic static method for Question 3
    public static <E extends Comparable<E>> E maximum(E e1, E e2, E e3){
        if (e1.compareTo(e2) > 0) {
            if (e1.compareTo(e3) > 0) {
                return e1;
            } else {
                return e3;
            }
        } else {
            if (e2.compareTo(e3) > 0) {
                return e2;
            } else {
                return e3;
            }
        }
    }
}

//main method
class TestCompareMax {
    public static void main(String[] args) {
        System.out.println(CompareMax.maximum(8,12,12));
        System.out.println(CompareMax.maximum('A', 'X', 'K'));
        System.out.println(CompareMax.maximum(2.4, 92.0, 2.53));
        System.out.println(CompareMax.maximum("blue", "orange", "tan"));
    }
}

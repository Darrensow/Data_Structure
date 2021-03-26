package Week2.Tutorials;

import java.util.ArrayList;

public class Question7 {
    public static void main(String[] args) {
        ArrayList<String> vehicle = new ArrayList<>();
        ArrayList<Object> transportation = new ArrayList<>();
        allTransportation(vehicle, transportation);
    }

    //Ask Dr. or demo, what's the difference between these three methods?
    //When to use wildcards when not to, and are there any difference in using them?
    public static <E> void allTransportation(ArrayList<?> e, ArrayList<?> f) { }

    // The <E> below is not used, so not needed, however the question requires us to create a static generic method, so we have to put the <E>
//    public static <E> void allTransportation(ArrayList<?> e, ArrayList<?> f) { }



//    public static void allTransportation(ArrayList<?> e, ArrayList<?> f) { }
//    public static <E,F> void allTransportation(E e, F f) { }
}

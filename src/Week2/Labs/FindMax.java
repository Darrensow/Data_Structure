package Week2.Labs;

public class FindMax {
    //main method
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3};
        String[] strArray = {"red", "green", "blue"};
        Circle[] circleArray = {new Circle(3), new Circle(2.9), new Circle(5.9)};
        System.out.println("Max Value for intArray : " + max(intArray));
        System.out.println("Max Value for strArray : " + max(strArray));
        System.out.println("Max Value for circleArray : " + max(circleArray));
        System.out.println();
        System.out.println("For tracing which circle object :");
        System.out.println("Circle 1 " + circleArray[0]);
        System.out.println("Circle 2 " + circleArray[1]);
        System.out.println("Circle 3 " + circleArray[2]);
    }

    //Question 5
    public static <E extends Comparable<E>> E max(E[] list){
        E maxValue = list[0];

        for (int i = 1; i < list.length; i++) {
            if (list[i].compareTo(maxValue) > 0) {
                maxValue = list[i];
            }
        }

        return maxValue;
    }
}

//Circle class
class Circle implements Comparable<Circle>{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public int compareTo(Circle o) {
        if (this.radius > o.radius) {
            return 1;
        } else if (this.radius < o.radius) {
            return -1;
        } else {
            return 0;
        }
    }
}

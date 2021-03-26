package Week2.Labs;

//Question 6
public class MinMaxTwoDArray<E> {
    private E e;

    public E getE() {
        return e;
    }

    public MinMaxTwoDArray(E e) {
        this.e = e;
    }

    public static <E extends Comparable<E>> E min(E[][] list){
        E minValue = list[0][0];
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (list[i][j].compareTo(minValue) < 0) {
                    minValue = list[i][j];
                }
            }
        }
        return minValue;
    }
    public static <E extends Comparable<E>> E max(E[][] list){
        E maxValue = list[0][0];
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (list[i][j].compareTo(maxValue) > 0) {
                    maxValue = list[i][j];
                }
            }
        }
        return maxValue;
    }
}

class TestConsoleQ6 {
    public static void main(String[] args) {
        Integer[][] int2DArray = { {4,5,6}, {1,2,3}};
        MinMaxTwoDArray<Integer[][]> numbers = new MinMaxTwoDArray<>(int2DArray);
        System.out.println("Max value " + MinMaxTwoDArray.max(numbers.getE()));
        System.out.println("Min value " + MinMaxTwoDArray.min(numbers.getE()));
    }
}
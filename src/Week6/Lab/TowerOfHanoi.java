package Week6.Lab;

public class TowerOfHanoi {
    public static void main(String[] args) {
        MyStackV2<String> stack1 = new MyStackV2<>("A");
        stack1.push("AAAAA");
        stack1.push("AAA");
        stack1.push("A");
        MyStackV2<String> stack2 = new MyStackV2<>("B");
        MyStackV2<String> stack3 = new MyStackV2<>("C");
        printRods(stack1, stack2, stack3);
        towerOfHanoi(3, stack1, stack2, stack3);
    }

    public static void printRods(MyStackV2 stack1, MyStackV2 stack2, MyStackV2 stack3) {
        System.out.println("Rod 1: " + stack1.toString());
        System.out.println("Rod 2: " + stack2.toString());
        System.out.println("Rod 3: " + stack3.toString());
    }

    public static <E> void towerOfHanoi(int n, MyStackV2<E> origin, MyStackV2<E> dest, MyStackV2<E> aux) {
        System.out.println("n = " + n);
        if (n == 1) {
            E e = (E) origin.pop();
            System.out.println("Move disc " + e + " from rod " + origin.getName() + " to rod " + dest.getName());
            dest.push(e);
//            printRods(origin, aux, dest);
            return;
        }
        towerOfHanoi(n-1, origin, aux, dest);
        towerOfHanoi(n-1, aux, dest, origin);
    }
}

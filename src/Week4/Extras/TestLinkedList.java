package Week4.Extras;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xianp
 */
public class TestLinkedList {

    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList();
        // adding the elements into list
        System.out.println("adding the a,b,c,d,e into the list....");
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        System.out.println("");
        System.out.println("the middle element is : "+list.getMiddleValue());
        // print elements
        System.out.println("printing the list....");
        list.print();

        // reverse the list
        System.out.println("");
        System.out.println("reversing the list....");
//        list.reverse_print();            // just print in the reserve order
        list.reverse();
        System.out.println("printing the list after reverse....");
        list.print();

        // retrieve the first and last value
        System.out.println("");
        System.out.println("The size of list : " + list.size);
      
        System.out.println("");
        System.out.println("The first element : " + list.getFirst());
        System.out.println("The last element : " + list.getLast());
        // remove middle value
      
        System.out.println("");
        System.out.println("Element that removed : " + list.remove(list.size / 2));
      
        System.out.println("");
        System.out.println("the index location of b : " + list.indexOf("b"));
        System.out.println("the index location of c : " + list.indexOf("c"));
       
        System.out.println("");
        System.out.println("this list contains c : " + list.contains("c"));
       
        System.out.println("");
        list.add("any value");  // need to make the list same size will the replacing we nned to do 
        System.out.println("replacing item with h,e,l,l,o .......");
        list.set(0, "h");
        list.set(1, "e");
        list.set(2, "l");
        list.set(3, "l");
        list.set(4, "o");
        System.out.println("the list after replace : ");
        list.print();
    }
}

package solution;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given array list.
 */

public class Program6 {
    public static void main(String[]args){
        List<String> list=new ArrayList<>();
        list.add("Red");
        list.add("White");
        list.add("Orange");
        list.add("Black");
        list.add("Purple");
        System.out.println(list);

        String element=list.get(0);
        System.out.println("First element: " +element);

        element=list.get(1);
        System.out.println("Second element: " +element);

        element= list.get(4);
        System.out.println("Fifth element: " +element);
}



}


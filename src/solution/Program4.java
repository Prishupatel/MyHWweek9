package solution;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a Java program to create a new array list,
 * add some colours (string) and printout the collection using for each loop.
 * @Kishan
 */

public class Program4 {
    public static void main(String[]args){
        List<String> list=new ArrayList<>();
        list.add("Red");
        list.add("White");
        list.add("Orange");
        list.add("Black");
        list.add("Purple");
        System.out.println(list);
    }


}

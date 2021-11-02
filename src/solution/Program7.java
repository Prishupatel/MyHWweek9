package solution;

import java.util.ArrayList;

/**
 * Write a Java program to test an array list is empty or not. Define array list with underground tube names
 */
public class Program7 {
    public static void main(String[] args) {

        ArrayList list=new ArrayList();               //creating empty

        if(list.isEmpty())
        {
            System.out.println("The Array List is empty");
        }
        else
        {
            System.out.println("Array list is not empty");
        }


    }
}

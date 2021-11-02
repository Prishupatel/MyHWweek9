package solution;

import java.util.ArrayList;
import java.util.Iterator;

/*
Write a Java program to iterate through all elements in an array list using Iterator.
 */
public class Program5 {
    public static void main(String[] args) {
        ArrayList<Integer> a1= new ArrayList<>();

        for(int i=0; i<10; i++)
            a1.add(i);

        System.out.println(a1);

        Iterator itr= a1.iterator();

        while(itr.hasNext()){
            int i=(Integer)itr.next();
            System.out.println(i + " ");
        }

    }
}

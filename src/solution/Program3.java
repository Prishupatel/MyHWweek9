package solution;

import java.util.Arrays;

/**
 * 3. Write a Java program to reverse an array of integer values.
 * @Kishan
 */
public class Program3
{
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Array before reverse: " + Arrays.toString(array) );

        for(int i=0; i< array.length/2; i++){
            int temp=array[i];
            array[i]=array[array.length-i-1];
            array[array.length-i-1]=temp;

        }

        System.out.println("Array after reverse: "+Arrays.toString(array));
    }





}

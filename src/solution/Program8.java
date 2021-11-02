package solution;

import java.util.HashSet;
import java.util.Set;

/**
 * Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers are between 1 and 10 are in the set. (Hint: use for loop and if else)
 */
public class Program8 {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(4);
        set.add(7);
        set.add(8);

        for(int a : set)
        {
            for(int i=0;i<=10;i++){
                if(i==a){
                    System.out.println(a);
                }
            }
        }
    }
}

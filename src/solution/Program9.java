package solution;

import java.util.HashMap;

/**
 * Create a HashMap object called people that will store String keys and Integer values:
 * And use for each loop to iterate the value from Map.
 */
public class Program9
{
    public static void main(String[] args)
    { //creating empty hash map

        HashMap<String, Integer> map= new HashMap<>();

        map.put("Kishan",1);
        map.put("John",2);
        map.put("Prime",3);
        map.put("Smith",4);

        System.out.println("Size of the map is : " +map.size());

        System.out.println(map);

        if(map.containsKey("Kishan")){

            Integer a=map.get("Kishan");
            System.out.println("Value for key - " + "Kishan is : " +a);
        }


    }
}

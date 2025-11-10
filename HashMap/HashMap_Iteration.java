package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap_Iteration {
    public static void main(String[] args) {
        
    //Map.Entry<Integer, Integer> e : Map.entrySet()

        // int arr[] = {10, 20 ,30};
        // for(int i=0; i<3; i++){               //it iterates takes value form every index
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();

        // for(int val : arr){                     // it takes directly values from aray no need to use index
        //     System.out.print(val + " ");
        // }
        // System.out.println();

        HashMap <String, Integer> map = new HashMap<>();

        map.put("India", 110);
        map.put("China", 120);
        map.put("USA", 80);

        // for(Map.Entry<String, Integer> e : map.entrySet()) {

        //     System.out.println(e.getKey());
        //     System.out.println(e.getValue());

        // }

        //  Set<String> keys = map.keySet();
        //  for(String key : keys ) {
        //     System.out.println(key+ " " + map.get(key));
        //  }
        
        map.remove("China");
        System.out.println(map);

    }
}

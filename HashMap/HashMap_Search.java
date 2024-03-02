package HashMap;

import java.util.HashMap;

public class HashMap_Search {
    public static void main(String[] args) {
         HashMap <String, Integer> map = new HashMap<>();

        map.put("India", 140);
        map.put("China", 120);
        map.put("USA", 80);

        if(map.containsKey("China")) {

            System.out.println("Key is present in map");

        }
        else{
            System.out.println("Key is not present in java");
        }

        System.out.println(map.get("India"));      // if key exists, then it will print value , otherwise not
        System.out.println(map.get("Pakistan"));      // if key doesn't exists, then it will print value - null
        

    }    
}

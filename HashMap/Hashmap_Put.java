package HashMap;

import java.util.HashMap;

public class Hashmap_Put {

    public static void main(String[] args) {
        
        HashMap <String, Integer> map = new HashMap<>();

        map.put("India", 140);
        map.put("China", 120);
        map.put("USA", 80);

        System.out.println(map);

        map.put("China", 130);
        System.out.println(map);

    }
    
}

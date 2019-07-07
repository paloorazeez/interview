package collection;

import java.util.HashMap;
import java.util.Map;

public class IdentityHashMap {

    public static void main(String[] args) {
        Map<String,Integer> hm = new HashMap<>();
        hm.put("One",1);
        hm.put(new String("One"),1);
        System.out.println(hm);


        Map<String,Integer> ihm = new java.util.IdentityHashMap<>();
        ihm.put("One",1);
        ihm.put(new String("One"),1);
        System.out.println(ihm);
    }
}

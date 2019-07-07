package collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapHashTableDiff1 {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        map.put(null,"default");
        System.out.println(map.get(null));
        Collections.synchronizedMap(map);

        LinkedHashMap lm = new LinkedHashMap();
        lm.put(1,1);
    }
}

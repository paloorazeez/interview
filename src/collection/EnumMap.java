package collection;

import java.util.HashMap;
import java.util.Map;

public class EnumMap {
    enum Color{
        RED,BLUE,GREEN
    }

    public static void main(String[] args) {

        Map<Color,String> map = new java.util.EnumMap<Color, String>(Color.class);
        map.put(Color.BLUE,null);
        map.put(Color.GREEN,null);
        map.put(Color.RED,null);
        System.out.println(map);
    }
}

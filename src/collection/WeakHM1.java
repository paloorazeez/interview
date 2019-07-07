package collection;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHM1 {

    public static void main(String[] args) throws InterruptedException {

        Map<String,Integer> wp = new WeakHashMap<>();
        String one = "one";
        wp.put(one,1);
        System.out.println(wp);
        one = null;
        System.gc();
        Thread.sleep(4000);
        System.out.println(wp);

        Map<Key,String> wm = new WeakHashMap<>();
        Key k1 = new Key();
        wm.put(k1,null);
        System.out.println(wm);

        k1 = null;
        System.gc();
        Thread.sleep(4000);
        System.out.println(wm);

    }
}

class Key{

}

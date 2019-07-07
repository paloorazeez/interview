package collection;

import java.util.HashSet;
import java.util.Set;

public class HashSet1 {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        System.out.println(set.add("one"));

        System.out.println(set.add("one"));
    }
}

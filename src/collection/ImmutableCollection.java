package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableCollection {
    public static void main(String[] args) {
        List<String> listOfString = new ArrayList<>();
        listOfString.add("Java");
        listOfString.add("Kotlin");
        listOfString.add("Groovy");
        listOfString.add("Scala");
        listOfString = Collections.unmodifiableList(listOfString);

        listOfString.remove(0);

        System.out.println(listOfString);

    }
}

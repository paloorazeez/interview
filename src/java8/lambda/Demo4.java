package java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Demo4 {

    public static void main(String[] args) {

        List<Person> list = Arrays.asList(new Person[]{
                new Person("Azeez", "Paloor", 32),
                new Person("Rashida", "Farsath", 32),
                new Person("Ayaan", "Paloor", 32),
                new Person("Jasmin", "TK", 32),
                new Person("Fathima", "Ibrahim", 32),
                new Person("Ibrahim", "Paloor", 32)
        });


        Collections.sort(list, (p1,p2)-> p1.getFirstName().compareTo(p2.getFirstName()));
        System.out.println("Print all people");
        printConditionally(list,p->true, p-> System.out.println(p));


        System.out.println("Print peoples firstName starts with A");
        printConditionally(list, p->p.getFirstName().startsWith("A"),p-> System.out.println(p));

        System.out.println("Print peoples lastName is Paloor");
        printConditionally(list, p->p.getLastName().equalsIgnoreCase("paloor"),p-> System.out.println(p.getFirstName()));


    }



    private static void printConditionally(List<Person> list, Predicate<Person> condition, Consumer<Person> consumer) {
        for (Person p: list) {
            if(condition.test(p))
                consumer.accept(p);
        }
    }
}



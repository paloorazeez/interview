package java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Demo3 {

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
        printConditionally(list,p->true);


        System.out.println("Print peoples firstName starts with A");
        printConditionally(list, p->p.getFirstName().startsWith("A"));

        System.out.println("Print peoples lastName is Paloor");
        printConditionally(list, p->p.getLastName().equalsIgnoreCase("paloor"));


    }



    private static void printConditionally(List<Person> list, Predicate<Person> condition) {
        for (Person p: list) {
            if(condition.test(p))
                System.out.println(p);
        }
    }
}

class Person{

    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}

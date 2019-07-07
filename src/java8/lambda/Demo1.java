package java8.lambda;

public class Demo1 {

    public static void main(String[] args) {

        Runnable r1 = ()->{

            Greeter greeter = new Greeter();
            Greeting greeting = ()-> System.out.println("Good morning");
            greeter.perform(greeting);

        };

        new Thread(r1).start();


    }
}

class Greeter
{
    public void perform(Greeting greeting)
    {
        greeting.greet();
    }
}

interface Greeting
        {
            void greet();
        }

package java8.lambda;

public class MethodReference1 {

    public static void main(String[] args) {

        //Thread t = new Thread(()->printMe());
        Thread t = new Thread(MethodReference1::printMe);
        t.start();
    }

    private static void printMe() {

        System.out.println("Hello");
    }
}

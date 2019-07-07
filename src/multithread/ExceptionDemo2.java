package multithread;

public class ExceptionDemo2 {

    public static void main(String[] args) {
        System.out.println(hello());
    }

    private static int hello() {
        try{
            throw new RuntimeException("dwed");
        }finally{
            return 10;
        }
    }
}

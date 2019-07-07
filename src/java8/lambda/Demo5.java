package java8.lambda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Demo5 {

    public static void main(String[] args) {

        int key =0;
        int arr[] = new int[]{1,2,3,4,5,0};
        process(arr,key,wrapper((v,k)->System.out.println(v/k)));
    }

    private static void process(int[] arr, int key, BiConsumer<Integer,Integer> consumer) {

        for (int i:arr) {
            consumer.accept(i,key);
        }
    }

    private static BiConsumer<Integer,Integer> wrapper(BiConsumer<Integer,Integer> consumer)
    {
        return (v,k)-> {
            try{
                consumer.accept(v,k);
            }catch (ArithmeticException e)
            {
                System.out.println("Arithmatic Exception");
            }

        };
    }
}

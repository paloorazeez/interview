package java8.lambda;

public class Demo2 {

    public static void main(String[] args) {

        printLambda(s->s.length(),"Azeez");

    }

    public static void printLambda(StringLengthLambda l,String input)
    {
        System.out.println("length of "+input+" is:"+l.getLength(input));
    }
}

interface StringLengthLambda
{
    int getLength(String input);
}

package oops;

public class CastingDemo1 {

    public static void main(String[] args) {

        A2 a2 = new A2();
        B2 b2 = (B2) a2;//runtime ClassCastException
        b2.m2();
    }
}

class A2
{
    void m1()
    {
        System.out.println("m1");
    }


}

class B2 extends A2{
    void m2()
    {
        System.out.println("m2");
    }
}
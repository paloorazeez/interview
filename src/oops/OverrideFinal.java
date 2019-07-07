package oops;

public class OverrideFinal {
    public static void main(String[] args) {
        A1 o = new B1();
        o.m1();
    }
}

class A1{
    void m1()
    {
        System.out.println("m1:A1");
    }
}

class B1 extends A1{

    @Override
    final void m1() {
        System.out.println("m1:B1");
    }
}

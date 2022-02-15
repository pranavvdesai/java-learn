class A {
    public A() {
        System.out.println("A");
    }
}

class B extends A {
    public B() {
        this(5);
        System.out.println("B");
    }

    public B(int k) {
        System.out.println("B arg");
    }
}

public class Constructorchaining {
    public static void main(String[] args) {
        B b = new B();
    }
}
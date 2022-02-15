class A {
    public A(int x) {
        System.out.println("A");
    }
}
class B extends A {
    public B() {
        super(4); // calls A(int), if not added will give error as argument is missing
        System.out.println("B");
    }
}




public class Constructorinheritance {
public static void main(String[] args) {
    B b = new B();
}
}

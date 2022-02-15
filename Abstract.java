abstract class Hello {
    public void method() {
        System.out.println("Abstract method");
    }
    abstract void method3();

}
class B extends Hello {
    public void method2() {
        System.out.println("Concrete method");
    }

    void method3() {
        System.out.println("Abstract method");
    }

}
public class Abstract {
    public static void main(String[] args) {
        // Hello hi = new Hello(); // not possible

        // Hello hi2 = new B();
        // hi2.method();
        // hi2.method2(); // not possible

        B b = new B();
        b.method();
        b.method2();
        
    }
}
class Outer {
    static class Inner {
        void foo() {
            System.out.println("Inner.foo()");
        }
    }
    class NonstaticInner {
        void foo() {
            System.out.println("Outer.NonstaticInner.foo()");
        }
    }
}

public class InnerOuterClass {
    public static void main(String[] args) {
        // Outer.Inner // accessing static members
        Outer.Inner oi = new Outer.Inner();
        oi.foo();

        // non static Inner
        Outer ou = new Outer();
        Outer.NonstaticInner oiu = ou.new NonstaticInner();
        oiu.foo();
    }
}

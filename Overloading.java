class A {
    public void f1(int x) {
        System.out.println("Class AA");
    }
}

class B extends A {
    public void f1(int x) { // OVERRRIDING
        System.out.println("Class bb");
    }
    public void f1(int x, int y) {
        System.out.println("Class BB");
    }
}

public class Overloading {
    public static void main(String[] args) {
        B obj = new B();
        obj.f1(1); //AA
        obj.f1(1, 2); //BB
    }    
}

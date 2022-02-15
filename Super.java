class A {
    int z;

    public void f1() {
        System.out.println("A.f1");
    }
}

class B extends A {
    int z;

    public void f1() {
        System.out.println("f1");
        super.f1(); // call to A.f1
    }

    public void f2() {
        int z;
        z = 2;
        this.z = 3;
        super.z = 4;
    }
}

public class Super {
    public static void main(String[] args) {
        B obj = new B();
        obj.f1();
        obj.f2();
    }
}

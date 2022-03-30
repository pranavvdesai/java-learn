import java.util.*;

class A extends Exception {
    public A(String str) {
        super(str);
    }
}
class B extends A {
    public B(String str) {
        super(str);
    }
}
class C extends B {
    public C(String str) {
        super(str);
    }
}


public class ppset51 {
    public static void main(String[] args) {
        
        try{
            throw new A("inside A");
        }
        catch (A i) {
            System.out.println(i.getMessage());
            try{
                throw new B("inside B");
            }
            catch (B i1) {
                System.out.println(i1.getMessage());
                try{
                    throw new C("inside C");
                }
                catch (C i2) {
                    System.out.println(i2.getMessage());
                }
            }
        }
       
    }
}

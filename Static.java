
class ExampleStatic {
    int x; // instance variable
    static int y; // static variable

    public void fun1() {
    } // instance member function

    public static void fun2() {
        // cant access instance variable x
    } // static member function

    static class Test {
        public static String country = "India";
    }
}

public class Static {
    public static void main(String[] args) {
        ExampleStatic e = new ExampleStatic();
        e.fun1();
        ExampleStatic.fun2();
        ExampleStatic.y = 10;
        ExampleStatic.Test.country;


    }
}
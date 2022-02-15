final class Dummy {
    // cant create subclass
}

class Dummy1 {
    public final void someFunc() {

    }
}

class ChildDummy1 extends Dummy1 {
    public void someFunc() {
        // cant override final method
    }
}

public class Final {
    private final int x; // final instance variable
    // x=5; illegal, cannot assign a value to a final variable
   
    // public Final() {
    //     x = 5; // legal, can assign a value to a final variable
    // }

    {
        x = 10; // legal, can assign a value to a final variable
    }
    // value of x cannot be changed further

    private final static int y;
    static {
        y = 5;
    }

    public void func() {
        final int k; // local final variable; once initialised cannot be alteredd
    }
    
    public static void main(String[] args) {
        Final obj = new Final(); // x value is 0 if not initialized; x will be blank if final is added
    }
}

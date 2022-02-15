public class Initblock {
    private int x;
    private static int k;

    {
        System.out.println("Initblock x" + x);
        x = 5;
    }
    // static init block
    static { // can only access static members
        System.out.println("static init block k " + k);
        k = 10;
    }

    public Initblock() {
        // initblock is executed before constructor
        System.out.println("Constructor x" + x);
        System.out.println("staic k" + k);
    }
    public static void main(String[] args) {
        Initblock obj = new Initblock();

    }
}

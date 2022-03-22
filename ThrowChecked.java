import java.io.IOException;

public class ThrowChecked {
    public static void main(String[] args) throws IOException {
        throw new IOException(); //checked exception, compiler will show an error if throws IOException is not used or try catch is not used
        //throw new ArithmeticException(); //unchecked exception, compiler wont check and wont throw an error

        //try catch to handle checked exception
        // try{
        //     throw new IOException();
        // }
        // catch (IOException e) {
        //     System.out.println("Exception caught" + e.getMessage());
        // }
        // finally{
        //     System.out.println("Finally block");
        // }
    }
}

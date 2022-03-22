public class ExceptionExample1 {
    public static void main(String[] args) {
        try{
            System.out.println(3/0);

        }
        catch(ArithmeticException e){ //our catch, if not given then default catch will be used
            System.out.println("Exception caught" + e.getMessage());
        }
        // catch(NullPointerException e){ //this will not be executed, default catch will be used
        //     System.out.println("Exception caught" + e.getMessage());
        // }
        finally{
            System.out.println("Finally block");
        }
    }
}

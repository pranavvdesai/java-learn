public class ThrowExample1 {
    public static void main(String[] args) {
        int balance = 500;
        int withdrawal = 200;

        // if(withdrawal > balance){ //our try with default catch
        //     throw new ArithmeticException("Insufficient balance");
        // }
        // else {
        //     balance = balance - withdrawal;
        //     System.out.println("Withdrawal successful");
        //     System.out.println("Balance is " + balance);
        // }
        try{
            if(withdrawal > balance){ //our try with our catch
                throw new ArithmeticException("Insufficient balance");
            }
            else {
                balance = balance - withdrawal;
                System.out.println("Withdrawal successful");
                System.out.println("Balance is " + balance);
            }
        }
        catch(ArithmeticException e){ //our catch, if not given then default catch will be used
            System.out.println("Exception caught" + e.getMessage());
        }
        finally{
            System.out.println("Finally block");
        }
    }
}

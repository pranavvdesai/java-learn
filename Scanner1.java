import java.util.*;
public class Scanner1 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String name = sc.nextLine();

        System.out.println("The number is " + num + " and the name is " + name);
    }   
}

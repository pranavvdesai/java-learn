import java.util.*;
public class Problems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: a ");
        int a = sc.nextInt();
        System.out.println("Enter a number: b ");
        float b = sc.nextFloat();
        System.out.println("Enter a number: c ");
        double c = sc.nextDouble();
        double sum = a + b + c;
        System.out.println("Sum of a, b, c is: " + sum);
    }
}

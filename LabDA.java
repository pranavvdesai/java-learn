import java.util.Random;
public class LabDA extends Thread {
 Random r = new Random();
 synchronized void display() throws Exception {
 int flag = r.nextInt(2); //to randomise which thread shows what
 if (flag == 0) {
 System.out.println("Printing first 20 Fibonacci numbers:");
 long a=0;
 long b=1;

 System.out.print(a+" "+b+" ");

 for(int i=3;i<=20;i++)
 {
 long c = a+b;
 System.out.print(c+" ");
 a=b;
 b=c;

 }
 System.out.println();
 } else {
 System.out.println("Printing sum of reciprocal of first 100 numbers:");
 double sum = 0;
 for (int i = 1; i <= 100; i++) {
 sum += (double)1/i;

 }
 System.out.println(sum);
 }
 }
 public static void main(String[] args) throws Exception {
 LabDA t1 = new LabDA();
 LabDA t2 = new LabDA();
 System.out.println("Lets start printing!!");
 t1.start();t1.join();
 t2.start();t2.join();

 }
 public void run() {
 try {
 display();
 } catch (Exception e) {
 };
 }
}
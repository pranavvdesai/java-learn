class A implements Runnable {
    public void run() {
        long n1 = 0, n2 = 1, n3 = 0;
        for (int i = 2; i < 100; i++) {
            n3 = n1 + n2;
            System.out.print(n1 + " ");
            n1 = n2;
            n2 = n3;
        }
        System.out.println();

    }
}

class B implements Runnable {
    public void run() {
        double sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += (double) 1.0 / (i);

        }
        System.out.println("sum is " + sum);

    }
}

public class LabDA2 {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new A());
        Thread t2 = new Thread(new B());
        t1.start();
        t1.join();
        t2.start();
        t2.join();
    }

}
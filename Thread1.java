class A implements Runnable {
    public void run() {
        int i;
        for (i = 0; i < 5; i++) {
            System.out.println("A" + i);
        }
        System.out.println("A");
    }
}
class B implements Runnable {
    public void run() {
        int i;
        for (i = 0; i < 5; i++) {
            System.out.println("B" + i);
        }
        System.out.println("B");

    }
}

class C implements Runnable {
    public void run() {
        int i;
        for (i = 0; i < 5; i++) {
            System.out.println("C" + i);
        }
        System.out.println("C");

    }
}
public class Thread1{
    public static void main(String[] args) {
        Thread t1 = new Thread(new A());
        Thread t2 = new Thread(new B());
        Thread t3 = new Thread(new C());
        // set prioity
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        
    }
}
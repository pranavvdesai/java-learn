import java.util.*;

class hello_world extends Thread {

    public void run() {
        int i;
        for (i = 0; i < 100; i++) {
            System.out.println("A" + i + Thread.currentThread().getName() + " " + Thread.currentThread());
        }
    }
}

class desai extends Thread {
    public void run() {
        int i;
        for (i = 0; i < 100; i++) {
            System.out.println("B" + i);
        }
    }
}

public class Thread2 {
    public static void main(String[] args) {
        hello_world hell = new hello_world(); // child class object
        desai bdesai = new desai();
        hell.start(); // accessing the methods of super class Thread
        bdesai.start();
    }
}

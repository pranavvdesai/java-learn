
class Inp {
    int balance;

    public Inp(int balance) {
        this.balance = balance;
    }

    public synchronized int getBalance() {
        return balance;
    }

    public synchronized void setBalance(int balance) {
        this.balance += balance;
    }

}

public class Bank extends Thread {
    private Inp inp;
    private int amount;
    public Bank(Inp inp, int amount) {
        this.inp = inp;
        this.amount = amount;
    }
    public void run() {
        inp.setBalance(amount);
    }

    public static void main(String[] args) {
        Inp in = new Inp(1000);
        Bank b = new Bank(in, 130);
        Bank b2 = new Bank(in, 400);
        b.start();
        b2.start();
        try {
            b.join();
            b2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(in.getBalance());
    }
}

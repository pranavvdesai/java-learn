import java.util.*;

class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void withdraw(int amount) {
        balance -= amount;
        System.out.println("Account " + ": " + balance);
        System.out.println("Withdrawing " + amount);

    }

    public boolean isSufficient(int amount) {
        return balance >= amount;
    }

}

class Customer implements Runnable {
    private Account account;

    public Customer(Account account) {
        this.account = account;
    }

    public void run() {

        synchronized (account) { // shared code goes here
            Scanner scanner = new Scanner(System.in);
            int amount = scanner.nextInt();
            if (account.isSufficient(amount)) {
                account.withdraw(amount);
            } else {
                System.out.println("Insufficient funds");
            }
        }

    }
}

public class ThreadSync {
    public static void main(String[] args) {
        Account account = new Account(1000);
        Customer customer1 = new Customer(account);
        Customer customer2 = new Customer(account);
        Customer customer3 = new Customer(account);
        Thread t1 = new Thread(customer1);
        Thread t2 = new Thread(customer2);
        Thread t3 = new Thread(customer3);
        t1.start();
        t2.start();
        t3.start();
    }
}

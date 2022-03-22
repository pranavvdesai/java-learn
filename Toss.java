import java.util.Random;

class TossThread implements Runnable {
    int coinA, coinB, coinC;

    public int getCoinA() {
        return coinA;
    }

    public void setCoinA(int coinA) {
        this.coinA = coinA;
    }

    public int getCoinB() {
        return coinB;
    }

    public void setCoin2(int coinB) {
        this.coinB = coinB;
    }

    public int getCoinC() {
        return coinC;
    }

    public void setCoinC(int coinC) {
        this.coinC = coinC;
    }

    Random rand = new Random();

    synchronized int sum() throws InterruptedException {
        coinA = rand.nextInt(2);
        coinB = rand.nextInt(2);
        coinC = rand.nextInt(2);
        return coinA + coinB + coinC;
    }

    public void run() {
        while (true) {
            try {
                int sum = sum();
                if (sum == 3) {
                    System.out.println(Thread.currentThread() + " wins" + "," + "sum=" + sum);
                    System.exit(0);
                }
            } catch (Exception e) {
            }
        }
    }

}

public class Toss {
    public static void main(String[] args) {
        Thread[] threads = new Thread[5];
        for (int i = 0; i < 5; i++)
            threads[i] = new Thread(new TossThread());
        for (int i = 0; i < threads.length; i++)
            threads[i].start();
    }
}

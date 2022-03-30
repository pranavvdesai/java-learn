import java.util.PriorityQueue;

public class priorityQ {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.add(60);
        pq.add(10);
        pq.add(100);
        // stores in sorted order as it inherits comparable interface
        System.out.println(pq);
        // removes the highest priority element(sorted by default)
        pq.poll();
    }
}

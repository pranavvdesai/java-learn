import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList al = new ArrayList(4);
        // al.add("A");
        // al.add("B");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            al.add(sc.next());
        }
        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

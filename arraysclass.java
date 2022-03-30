import java.util.*;

// preemptive type, int long float double type arrays
public class arraysclass {
    public static void main(String[] args) {
        int a[] = new int[]{4,10,3,5,1};
        int i;
        for (i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        Arrays.sort(a);
        for (i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        int b[] = new int[5];
        Arrays.fill(b, 66);
        for (i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}

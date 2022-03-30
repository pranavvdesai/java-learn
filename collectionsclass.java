import java.util.*;;

// non preemptive type, collections framework
public class collectionsclass {
    public static void main(String[] args) {
        Vector v = new Vector();
        // v.add(60);
        // v.add(10);
        // v.add(100);
        v.add("java");
        v.add("c");
        v.add("php");
        System.out.println(v);
        // a method in class Collections
        Collections.sort(v);
        System.out.println(v);
        // binarySearch works only on a sorted list
        int x = Collections.binarySearch(v, "c");
        System.out.println(x);
    }
}

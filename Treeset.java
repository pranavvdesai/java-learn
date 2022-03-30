import java.util.*;

// stores in sorted order

public class Treeset {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();

        // how it sorts?
        // comparable interface
        // o1.compareTo(o2); if o1>o2 return 1, if o1<o2 return -1, if o1==o2 return 0

        // ts.add("pranav");
        // ts.add("hi");
        // ts.add("Desai");
        // ts.add("uwdehfuiwef");
        
        // stringbuffer hasnt impleneted comparable,therefore objs cant access compareTo() => so will give error
        ts.add(new StringBuffer("B"))
        ts.add(new StringBuffer("A"))
        ts.add(new StringBuffer("G"))

        // comparator interface
        // compare(o1,o2) if o1>o2 return 1, if o1<o2 return -1, if o1==o2 return 0

        System.out.println(ts.subSet("hi", "Desai")); // hi 

    }
}

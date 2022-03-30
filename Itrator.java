import java.util.*;

public class Itrator {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        for (int i = 0; i < 10; i++) {
            al.add(i);
        }
        
        Iterator it = al.iterator();
        while (it.hasNext()) {
            Integer i = (Integer) it.next();
            if (i % 2 == 0) {
                it.remove();
            }
        }
    }
}

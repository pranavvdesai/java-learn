import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put("java", "c");
        hm.put("c", "java");
        hm.put("php", "c++");
        System.out.println(hm);
        hm.get("c");

    }
}

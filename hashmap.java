import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put("java", "c");
        hm.put("c", "java");
        hm.put("php", "c++");
        System.out.println(hm);
        hm.get("c");
        Map<String, String> hm2 = new HashMap<String, String>();
        FileInputStream fis = new FileInputStream("/home/saurabh/Desktop/hashmap.java");
        Scanner sc = new Scanner(fis);
        while (sc.hasNext()) {
            String word = sc.nextLine()
            String split = word.split(" ");
            for (int i = 0; i < split.length; i++) {
                if (hm2.containsKey(split[i])) {
                    hm2.put(split[i], hm2.get(split[i]) + 1);
                } else {
                    hm2.put(split[i], 1);
                }
            }

        }

    }
}

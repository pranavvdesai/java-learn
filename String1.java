public class String1 {
    public static void main(String[] args) {
        String s = "Hello World";
        String s2 = s.toUpperCase();
        System.out.println(s2);
        int i = s.indexOf("l");
        System.out.println(i);
        int i2 = s.indexOf("Wor");
        System.out.println(i2);
        if(s.equals(s2)){
            System.out.println("s and s2 are equal");
        } else {
            System.out.println("s and s2 are not equal");
        }
        System.out.println(s.substring(3));
    }
}

public class Wrapper {
    public static void main(String[] args) {
        // Integer.valueOf("123"); //valueOf is a static method in the Integer class
        Integer i1 = Integer.valueOf("123"); //valueOf is a static method in the Integer class
        // Double.valueOf("123.45"); // String as argument
        Double d1 = Double.valueOf("123.45"); // String as argument

        int a = Integer.parseInt("123"); // parseInt is a static method in the Integer class, converts String to int, returns int type value
        double b = Double.parseDouble("123.45"); // parseDouble is a static method in the Double class, converts String to double
    
        int c = i1.intValue(); // intValue is a instance method in the Integer class, returns int type value
        System.out.println(c);
        System.out.println(i1);
        System.out.println(d1);
        System.out.println(a);
        System.out.println(b);


    }
}

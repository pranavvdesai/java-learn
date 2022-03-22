package pack1;
import pack2.Student;
public class Student2 {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.setRollno(123);
        s1.setName("John");
        System.out.println(s1.getRollno());
        System.out.println(s1.getName());
    }
}

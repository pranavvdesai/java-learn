public class PersonMain {
    public static void main(String[] args) {
        PersonInherit p = new PersonInherit();
        p.setAge(20);
        p.setName("John");
        p.setRollno(1);
        System.out.println("Age: " + p.getAge());
        System.out.println("Name: " + p.getName());
        System.out.println("Rollno: " + p.getRollno());
    }
}

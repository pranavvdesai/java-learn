import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Student implements Comparable<Student> {
    String name;
    String regno;
    float cgpa;

    public Student(String name, String regno, float cgpa) {
        this.name = name;
        this.regno = regno;
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public String getRegno() {
        return regno;
    }

    public float getCgpa() {
        return cgpa;
    }

    public int compareTo(Student stud) {
        if (getRegno() == null || stud.getRegno() == null) {
            return 0;
        }
        return getRegno().compareTo(stud.getRegno());
    }

    public static void main(String[] args) throws IOException {
        int rows = 1;
        ArrayList<Student> list = new ArrayList<Student>();
        FileWriter writer = new FileWriter("W:/javavsc/Student.xlsx");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        writer.write("Name" + "\t");
        writer.write("Reg" + "\t");
        writer.write("CGPA" + "\n");
        while (rows <= 2) {
            System.out.println("Name: ");
            String Name = reader.readLine();
            System.out.println("Reg no: ");
            String regno = reader.readLine();
            System.out.println("CGPA: ");
            float cgpa = Float.parseFloat(reader.readLine());
            list.add(new Student(Name, regno, cgpa));
            writer.write(Name + "\t");
            writer.write(regno + "\t");
            writer.write(cgpa + "\n");
            rows++;
            System.out.println("Rows:" + rows);
        }
        writer.close();
        Collections.sort(list);
        System.out.println("Records after sorting : ");
        for (Student stud : list) {
            System.out.println(stud.getName() + " " +
                    stud.getRegno() + " " +
                    stud.getCgpa());
        }
        ArrayList<Student> one = new ArrayList<Student>(list.subList(0, list.size() / 2));
        ArrayList<Student> two = new ArrayList<Student>(list.subList((list.size() / 2), list.size()));
        FileWriter writerone = new FileWriter("W:/javavsc/one.xlsx");
        FileWriter writertwo = new FileWriter("W:/javavsc/two.xlsx");
        int onerows = 0;
        int tworows = 0;
        writerone.write("Name" + "\t");
        writerone.write("Reg" + "\t");
        writerone.write("CGPA" + "\n");
        writertwo.write("Name" + "\t");
        writertwo.write("Reg" + "\t");
        writertwo.write("CGPA" + "\n");
        while (onerows <= one.size() - 1) {
            Student stud1 = one.get(onerows);
            writerone.write(stud1.name + "\t");
            writerone.write(stud1.regno + "\t");
            writerone.write(stud1.cgpa + "\n");
            onerows++;
        }
        writerone.close();
        while (tworows <= two.size() - 1) {
            Student stud2 = two.get(tworows);
            writertwo.write(stud2.name + "\t");
            writertwo.write(stud2.regno + "\t");
            writertwo.write(stud2.cgpa + "\n");
            tworows++;
        }
        writertwo.close();
    }
}
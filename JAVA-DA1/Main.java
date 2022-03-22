import javax.swing.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Student {
    private String registrationNumber;
    private String name;
    private String dob;
    private String address;
    private String mob;
    private String[] courses;
    String[] grade;
    int[] marks;
    int gpa;
    int creds;

    // accessor methods
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public String getAddress() {
        return address;
    }

    public String getMob() {
        return mob;
    }

    // mutator methods
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    int[] cred;

    public int[] getCred() {
        return cred;
    }

    public void setCred(int[] cred) {
        this.cred = cred;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public int getCreds() {
        return creds;
    }

    public void setCreds(int creds) {
        this.creds = creds;
    }

    public String[] getGrade() {
        return grade;
    }

    public void setGrade(String[] grade) {
        this.grade = grade;
    }

    public void getinfo(String name, String dob, String address, String mob) {
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.mob = mob;
    }
}

class Course {

    private String Code;
    private String CourseName;
    private int credits;

    // accessor methods
    public String getCode() {
        return Code;
    }

    public String getCourseName() {
        return CourseName;
    }

    public int getCredits() {
        return credits;
    }

    // mutator methods
    public void setCode(String code) {
        Code = code;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void getCourse(String Code, String CourseName, int credits) {
        this.Code = Code;
        this.CourseName = CourseName;
        this.credits = credits;
    }
}

public class Main {
    public static void studentadd(Student[] stud) {
        for (int i = 0; i < stud.length; i++) {
            String registrationNumber = JOptionPane.showInputDialog(null, "Enter reg. No.");
            String name = JOptionPane.showInputDialog(null, "Enter Name of Student");
            String dob = JOptionPane.showInputDialog(null, "Enter DOB");
            String address = JOptionPane.showInputDialog(null, "Enter Address of Student");
            String mob = JOptionPane.showInputDialog(null, "Enter Mobile Number");
            stud[i] = new Student();
            stud[i].setName(name);
            stud[i].setAddress(address);
            stud[i].setDob(dob);
            stud[i].setRegistrationNumber(registrationNumber);
            stud[i].setMob(mob);
        }
    }

    public static void courseadd(Course[] courseadd) {
        for (int i = 0; i < courseadd.length; i++) {
            Scanner sc = new Scanner(System.in);
            String Code = JOptionPane.showInputDialog(null, "Enter Course Code");
            String courseName = JOptionPane.showInputDialog(null, "Enter Course Name");
            System.out.println("Enter Course Credits");
            int credits = sc.nextInt();
            courseadd[i] = new Course();
            courseadd[i].setCode(Code);
            courseadd[i].setCourseName(courseName);
            courseadd[i].setCredits(credits);
        }
    }

    public static void setCourse(Student[] st, Course[] c) {
        String[] crallot = new String[3];
        int[] crds = new int[3];
        for (int i = 0; i < c.length; i++) {
            crallot[i] = c[i].getCourseName();
            crds[i] = c[i].getCredits();
        }
        Random rnd = new Random();
        for (int i = 0; i < st.length; i++) {
            String[] course = new String[c.length];
            int creds = 0;
            int[] creds1 = new int[c.length];
            for (int j = 0; j < c.length; j++) {
                int randomindex = rnd.nextInt(c.length);
                course[j] = crallot[randomindex];
                creds += crds[randomindex];
                creds1[j] = crds[randomindex];
                st[i].setCreds(creds);
            }
            st[i].setCourses(course);
            st[i].setCred(creds1);
        }
    }

    public static void display(Student[] stud) {
        for (int i = 0; i < stud.length; i++) {
            System.out.println(stud[i].getName());
            System.out.println(Arrays.toString(stud[i].getCourses()));
            System.out.println(Arrays.toString(stud[i].getMarks()));
            System.out.println(Arrays.toString(stud[i].getGrade()));
            System.out.println(Arrays.toString(stud[i].getCred()));
            System.out.println("Total Creds " + stud[i].getCreds());
            System.out.println("GPA: " + stud[i].getGpa());
        }
    }

    public static void sameCourse(Student[] stud) {
        System.out.println("Students with Same Courses:");
        for (int i = 0; i < stud.length; i++) {
            for (int j = i + 1; j < stud.length; j++) {
                if (stud[i].getCourses() == stud[j].getCourses()) {
                    System.out.println(stud[j].getName());
                    System.out.println(stud[j].getCourses());
                    System.out.println(stud[j].getMarks());
                }
            }
        }
    }

    public static void setmarks(Student[] stud) {
        Random rand = new Random();
        for (int i = 0; i < stud.length; i++) {
            int smarks[] = new int[stud[i].getCourses().length];
            for (int j = 0; j < stud[i].getCourses().length; j++) {
                smarks[j] = rand.nextInt(100);
                stud[i].setMarks(smarks);
            }

        }
    }

    public static void setgrade(Student[] stud) {
        int mark[] = new int[stud.length];
        for (int i = 0; i < stud.length; i++)
             = stud[i].getMarks();
        for (int i = 0; i < stud.length; i++) {
            String grade[] = new String[mark.length];
            for (int j = 0; j < mark.length; j++) {
                String grade = new String();
                if (mark[j] >= 90)
                    grade = "A";
                else if (mark[j] >= 80 && m[j] < 90)
                    grade = "B";
                else if (mark[j] >= 70 && mark[j] < 80)
                    grade = "C";
                else if (mark[j] >= 60 && mark[j] < 70)
                    grade = "D";
                else if (mark[j] >= 40 && mark[j] < 60)
                    grade = "E";
                else
                    grade = "F";
                g[j] = grade;
                stud[i].setGrade(g);
            }
        }
    }

    public static void computegpa(Student[] st) {
        int gpa = 0;
        for (int i = 0; i < st.length; i++) {
            String[] grades = st[i].getGrade();
            int gradepoint = 0;
            if (grades.equals("A"))
                gradepoint = 10;
            else if (grades.equals("B"))
                gradepoint = 9;
            else if (grades.equals("C"))
                gradepoint = 8;
            else if (grades.equals("D"))
                gradepoint = 7;
            else if (grades.equals("E"))
                gradepoint = 6;
            else
                gradepoint = 5;
            gpa = (gradepoint * st[i].getCred()[i]) / (st[i].getCreds());
            st[i].setGpa(gpa);
        }
    }

    public static void main(String[] args) {
        Student[] stud = new Student[];
        Course[] crse = new Course[];
        studentadd(stud);
        courseadd(crse);
        setCourse(stud, crse);
        setmarks(stud);
        setgrade(stud);
        display(stud);
    }
}
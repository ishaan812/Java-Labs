import java.util.*;

class Student {
    String name;

    public Student(String s) {
        this.name = s;
    }

    public Student() {
        this.name = "Unknown";
    }

    public void printName() {
        System.out.println("The Name of the Student is " + name);
    }

    public static void main(String[] args) {
        String a;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Name of the Student : ");
        a = s.nextLine();
        Student st1 = new Student(a);
        Student st2 = new Student();
        st1.printName();
        st2.printName();
        s.close();
    }
}

class StudentID {
    String name;
    int roll_no;

    public StudentID(String s, int r) {
        this.name = s;
        this.roll_no = r;
    }

    void print() {
        System.out.println("Name of the Student is " + name);
        System.out.println("Roll No. of the Student is " + roll_no);
    }

    public static void main(String[] args) {
        StudentID ob = new StudentID("Jay", 2);
        ob.print();
    }
}

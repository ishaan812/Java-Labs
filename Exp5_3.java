import java.util.*;

class MarksOutOfBoundsException extends Exception {
    public MarksOutOfBoundsException(String s) {
        super(s);
    }
}

class StudentResult {
    public static void main(String[] args) {
        int centerNo, seatNo, marks;
        String name, date;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name : ");
        name = s.nextLine();
        System.out.println("Enter your Center Number : ");
        centerNo = s.nextInt();
        System.out.println("Enter your Seat Number : ");
        seatNo = s.nextInt();
        System.out.println("Enter the date : ");
        date = s.next();
        try {
            System.out.println("Enter your marks : ");
            marks = s.nextInt();
            if (marks < 0 || marks > 100) {
                throw new MarksOutOfBoundsException("The marks should be between 0 to 100");
            }
        } catch (MarksOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Name of the Student is " + name + ", their seat number is " + seatNo
                    + ", and their center number is " + centerNo + ", and the date is " + date);
        }
    }
}
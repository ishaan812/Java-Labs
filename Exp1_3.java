import java.util.*;

class Multiples {
    public static void main(String[] args) {
        int n, i = 1;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        n = s.nextInt();
        System.out.println("Multiples Of " + n + " are : ");
        while (i <= 10) {
            System.out.println(n + " x " + i + " = " + (n * i));
            i += 1;
        }
    }
}

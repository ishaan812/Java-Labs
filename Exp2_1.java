import java.util.*;
import First.User;

class UserPackage {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String a = s.nextLine();
        User us = new User();
        us.print(a);
        s.close();
    }
}
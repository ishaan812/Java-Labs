import java.util.*;
import java.lang.Math;

class Number {
    public static void factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        System.out.println("The Factorial of " + n + " is " + f);
    }

    public static void testArmstrong(int n) {
        int temp, digits = 0, d, sum = 0;
        temp = n;
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }
        temp = n;
        while (temp > 0) {
            d = temp % 10;
            sum += (Math.pow(d, digits));
            temp = temp / 10;
        }
        if (n == sum) {
            System.out.println(n + " is a Armstrong Number");
        } else {
            System.out.println(n + " is not a ArmStrong Number");
        }
    }

    public static void testPalindrome(int n) {
        int temp, rev = 0, d;
        temp = n;
        while (temp > 0) {
            d = temp % 10;
            rev *= 10 + d;
            temp /= 10;
        }
        if (rev == n) {
            System.out.println(n + " is Palindrome Number");
        } else {
            System.out.println(n + " is not a Palindrome Number");
        }
    }

    public static void testPrime(int n) {
        int flag = 0;
        double l = Math.sqrt(n);
        if (n == 1 || n == 0) {
            System.out.println(n + " is not a Prime Number");
        }
        for (int i = 2; i <= l; i++) {
            if (n % i == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println(n + " is not a Prime number");
        } else {
            System.out.println(n + " is a Prime number");
        }
    }

    public static void main(String[] args) {
        int n, choice;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        n = s.nextInt();
        System.out.println(
                "Select\n1: Factorial\n2: To Test Armstrong Number\n3: To Test Palindrome\n4: To Check For Prime Number\n5: End");
        choice = s.nextInt();
        switch (choice) {
            case 1:
                factorial(n);
                break;
            case 2:
                testArmstrong(n);
                break;
            case 3:
                testPalindrome(n);
                break;
            case 4:
                testPrime(n);
                break;
            case 5:
                break;
            default:
                System.out.println("Please Enter Appropriate Choice");
                break;
        }
    }
}
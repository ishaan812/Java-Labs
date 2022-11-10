import java.util.*;

class Question2 {
    public static void main(String[] args) {
        int valid = 0, invalid = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the input : ");
        String x = s.nextLine();
        for (int i = 0; i < x.length(); i++) {
            try {
                int n = Integer.parseInt(Character.toString(x.charAt(i)));
                valid++;
            } catch (NumberFormatException e) {
                invalid++;
            }
        }
        System.out.println("There are " + valid + " valid Integers and " + invalid + " invalid Integers");
        s.close();
    }
}

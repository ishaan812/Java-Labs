import java.util.*;

class MinMax {
    public static void minMax(Integer[] arr, int k) {
        Arrays.sort(arr);
        System.out.println(k + "th Smallest Element of the array is : " + "\n" + arr[k - 1]);
        System.out.println(k + "th Largest Element of the array is : " + "\n" + arr[arr.length - k]);
    }

    public static void main(String[] args) {
        Integer arr[] = new Integer[] { 1, 4, 17, 7, 25, 3, 100 };
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of kth element : ");
        int k = s.nextInt();
        s.close();
        minMax(arr, k);
    }
}

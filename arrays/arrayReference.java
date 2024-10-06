package arrays;
import java.util.Scanner;

public class arrayReference {
    public static class Main {
        // method to print the array
        static void printarray(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            printarray(arr);

            int[] arr2 = arr;
            printarray(arr2);
            arr[2]=100;
            printarray(arr);
            printarray(arr2);
        }
    }
}

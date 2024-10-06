package Basics;
import java.util.Scanner;
public class sqaure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int sq = n*n;
        System.out.print("The square is: " + sq);

    }
}

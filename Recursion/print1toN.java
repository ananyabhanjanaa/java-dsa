package Recursion;
import java.util.Scanner;
public class print1toN {
    public static void print(int n)
    {
        //base case
        if(n==0) return;

        //call
        print(n-1);

        //work;
        System.out.println(n);;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
}

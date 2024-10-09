package Recursion;
import java.util.Scanner;
public class preInPost {

    public static void pip(int n)
    {
        if(n==0) return;

        //pre
        System.out.print(n);

        pip(n-1);

        //in
        System.out.print(n);

        pip(n-1);

        //post
        System.out.print(n);
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        pip(n);
    }
    
}

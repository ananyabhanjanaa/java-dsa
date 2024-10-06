package Recursion;
import java.util.Scanner;
public class printNto1 {

    public static void printn(int n)
    {
        if(n==0)
        return;
        System.out.println(n);
        printn(n-1);
        
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printn(n);
    }
}

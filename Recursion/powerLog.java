package Recursion;

import java.math.BigInteger;
import java.util.Scanner;



public class powerLog {
    
    public static long power(int n, int p)
    {
        if(p==0) return 1;
       
        long ans = power(n,p/2);

        if(p%2==0) return ans*ans; //if power is even
        else return ans * ans * n; //if power is odd
    }
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        System.out.println(power(n,p));
    }
}

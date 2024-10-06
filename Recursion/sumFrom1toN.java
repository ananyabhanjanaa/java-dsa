package Recursion;
import java.util.Scanner;
public class sumFrom1toN {
    public static int sum(int n){
        //base condition
        if(n==0) return 0;

        int ans = n + sum(n-1); // work + function call
        return ans; //return statement
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
}

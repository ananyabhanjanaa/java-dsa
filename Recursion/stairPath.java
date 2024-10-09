package Recursion;
import java.util.Scanner;
public class stairPath {
    public static int stairs(int n)
     {
        if(n<=2) return n;
        int ans = stairs(n-1) +  stairs(n-2);
        return ans;
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(stairs(n));

    }
}

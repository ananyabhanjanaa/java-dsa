package Recursion;
import java.util.Scanner;
public class power {

    public static int power(int n, int p)
    {
        if(p==0) return 1;
       // if(p==1) return n;
        int ans = n * power(n,p-1);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        System.out.println(power(n,p));
    }
}

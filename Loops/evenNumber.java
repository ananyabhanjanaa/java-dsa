package Loops;
import java.util.Scanner;
public class evenNumber {
    public static void main(String[] args)
    {
        //even numbers
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
        //table of 19:
        for(int i =1;i<=n;i++)
        {
            System.out.println(i*19);
        }
        //1,5,9----- 10th term
        // ap:where n is the nth term, last term = 2n-1
        for(int i=1;i<2*n-1;i=i+4)
        {
            System.out.println(i);
        }

        //gp: a*r^n-1--> last term
        int a = 2;
        for(int i=0;i<n;i++)
        {
            System.out.println(a);
            a = a*2;
        }
    }
}

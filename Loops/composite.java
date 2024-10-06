package Loops;
import java.util.Scanner;
public class composite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        boolean isprime  = false;
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
            {
                isprime = true;
                break;
            }
        }
        if(isprime){
            System.out.println("composite");
        }
        else{
            System.out.println("prime number");
        }
    }
}

package Basics;
import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principle: ");
        float p = sc.nextFloat();
        System.out.print("Enter rate: ");
        float r = sc.nextFloat();
        System.out.print("Enter time: ");
        int t = sc.nextInt();
        float si = (p*r*t)/100;
        System.out.print("Simple Interest is: "+si);

    }
}

package Basics;
import java.util.Scanner;
public class sumOfNum {
    public static void main(String[] args) {
        //Sum of two numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("The sum is: " + a + b); 
        //string + a + b will return concatinated string
        System.out.println(a + b);
        int sum = a+b;
        System.out.println("The sum is: " + sum);


    }
}

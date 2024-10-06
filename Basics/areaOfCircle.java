package Basics;
import java.util.Scanner;
public class areaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        double pi = 3.14;
        double area = pi*r*r;
        System.out.print("The area of Circle is: " + area);
    }
}

package Basics;
import java.util.Scanner;
public class typeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //int to double typecasting
        int x= sc.nextInt();
        double y = (double)x;
        System.out.println(x/2);
        // x int me lia tha toh x/2 will also be int
        System.out.println(y/2);
        // thats why typecasting kia taaki decimal value achieve ho jaay


        // double to int
        double a = sc.nextDouble();
        int b = (int)a;
        System.out.println(b*100);
        System.out.println(a*100);
    }
}

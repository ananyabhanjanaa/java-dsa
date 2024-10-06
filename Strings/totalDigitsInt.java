package Strings;
import java.util.Scanner;
public class totalDigitsInt {
    public static void main(String[] args) {
        //calculate the total number of digits in a number without using loops
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = Integer.toString(n);
        System.out.println(s.length());
    }
}

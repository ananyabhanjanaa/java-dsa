package Conditionals;
import java.util.Scanner;
public class evenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2==0){
            System.out.print("even number");
        }
        else{
            System.out.print("odd number");

        }
    }
    
}

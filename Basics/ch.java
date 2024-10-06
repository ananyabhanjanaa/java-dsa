package Basics;
import java.util.Scanner;
public class ch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch ='A';
        char hh  ='B';
        System.out.println(ch);
        System.out.println(ch+0);
        System.out.println(ch-hh);
        System.out.println(ch+hh);
        System.out.println(ch+4+3);
        System.out.println("hekk"+4+3);
        System.out.println(ch+"ananya");
        
        //taking input of a char:
        char a = sc.next().charAt(0);
        int v = (int)a;
        System.out.println(a);
        System.out.print(v);
    }
}

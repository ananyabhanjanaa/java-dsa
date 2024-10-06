package StringBuilder;
import java.util.Scanner;
public class stringBuilder {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        String s = "abc";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity()); // 16(initial) + 3(abc-length) = 19

        //empty string
        StringBuilder x = new StringBuilder();
        System.out.println(x.length());
        System.out.println(x.capacity());
        //inital capacity of any empty string is 16

        StringBuilder y = new StringBuilder("");
        StringBuilder z = new StringBuilder("10"); // string 10 is passed 
        System.out.println(z.length());
        StringBuilder a = new StringBuilder(10); // capacity of string is passed as 10
        System.out.println(a.length());
        System.out.println(a.capacity()); // if we explicitely mention capacity of string then vo 16 nahi rehti, new capacity ho jati hai

        //reverse
        System.out.println(sb.reverse());

        //taking inputs:
        StringBuilder s1 = new StringBuilder(sc.nextLine());
        // we are taking input as a string and then storing it in a StringBuilder

        //aliter:
        //String s = sc.nextLine();
        //StringBuilder s1 = new StringBuilder(sc.nextLine(s));

        System.out.println(s1);
        //setCharAt -> changing char of string
        s1.setCharAt(1, 'K');

        System.out.println(s1);

        //append method -> we can append anything like bool, sting or even int
        s1.append(10);
        s1.append(true);
        System.out.println(s1);

        //insert-> inserting something 
        s1.insert(1, "hellow");
        s1.insert(4, 333);
        System.out.println(s1);

        //deleteChar -> delete a particular character
        s1.deleteCharAt(2);
        System.out.println(s1);

        //reverse() -> to reverse the string
        s1.reverse();
        System.out.println(s1);

        s1.delete(0, 7);
        // 0 is inclusive and 7 is exclusive so 6th index wale tak hi delete hoga
        System.out.println(s1);
    }
}

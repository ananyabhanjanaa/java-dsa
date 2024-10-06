package StringBuilder;
import java.util.Scanner;
public class palindromicString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // we cant reverse a string in java directly, so we'll make a stringbuilder in which we will pass string s then we'll reverse it
        // after reversing we'll change it back to string and compare if its a palindrom

        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        
        // we cant compare a stringbuilder directly with string
        String t = sb + ""; //adding anything to a string makes it a string

        if(s.equals(t))
        {
            System.out.println("palindrom string");
        }
        else{
            System.out.println("not a palindromic string");
        }
        
        

    }
}

package Strings;
import java.util.Scanner;
public class vowelsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int num =0 ;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a' ||s.charAt(i)=='e' || s.charAt(i)=='i'|| s.charAt(i)=='o'|| s.charAt(i)=='u'|| s.charAt(i)=='A' ||s.charAt(i)=='E' || s.charAt(i)=='I'|| s.charAt(i)=='O'|| s.charAt(i)=='U')
            {
                num ++;
            }
           
        }
        System.out.println("The number of vowels are: "+num);
        
    }
}

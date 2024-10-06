package StringBuilder;
import java.util.Scanner;
public class updateEvenIndex {
    public static void main(String[] args) {
        //Input a string and update all the even indices with char 'a'

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = ""; //empty string

        for(int i=0;i<s.length();i++)
        {
            if(i%2!=0)
            {
                t = t + s.charAt(i);
            }
            else{
                t = t + 'a';
            }
        }
        System.out.println(t);

    }
}

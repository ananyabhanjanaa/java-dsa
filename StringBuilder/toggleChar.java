package StringBuilder;
import java.util.Scanner;
public class toggleChar {
    public static void main(String[] args) {
        //Given a string, the task is to toggle all the characters of the string i.e convert Upper case to lower case and vice versa
        // A-> 65   Z-> 90
        // a-> 97   z-> 122
        // difference bw their ascii values:  32
        Scanner sc = new Scanner(System.in);
        StringBuilder str =new StringBuilder(sc.nextLine());
        System.out.println(str);
        
        //sample-> PhYsicS--> pHySICs (output)
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            int ascii = (int)ch; //typecasting-> hume character ka ascii value mil gaya
            //UPPER CASE
            if(ascii>=65 &&  ascii<=90)
            {
                ascii +=32;
                char dh = (char)ascii;
                str.setCharAt(i, dh);
            }

            //lower case
           else if(ascii>=97 &&  ascii<=122)
            {
                ascii -=32;
                char dh = (char)ascii;
                str.setCharAt(i, dh);
            }
        }

        //ALITER:-


        // for (int i = 0; i < str.length(); i++) {
        //     char ch = str.charAt(i);
        //     // Toggle the case
        //     if (ch >= 'A' && ch <= 'Z') {
        //         // Convert to lower case
        //         str.setCharAt(i, (char) (ch + 32));
        //     } else if (ch >= 'a' && ch <= 'z') {
        //         // Convert to upper case
        //         str.setCharAt(i, (char) (ch - 32));
        //     }
        // }
        System.out.println(str);
    }
}

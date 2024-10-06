package Strings;
import java.util.Scanner;
import java.util.ArrayList;
public class substringsPrint {
    public static void main(String[] args) {
        // take input of a string and print all the substrings of the string

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("");

        //Creating an ArrayList
        ArrayList<String> sub = new ArrayList<>();

        // IMPORTANT PART:
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<=s.length();j++)
            // j<=s.length() bcz substring me last wala exclude ho jata hai so when we go +1 last index means that is getting excluded and only last index tak substring will be included
            {
               // System.out.println(s.substring(i, j));
               sub.add(s.substring(i, j));

               // adding the substring to the ArrayList
            }
        }
        sub.add("");
        System.out.println(sub);
    }
}

//LOGIC:-

// ab
// i=0 j=1 ->a
// i=0 j=2 ->ab

// abc 
// i =0 j=1 -> a
// i=0 j=2 -> ab 
// i=0 j=3 - > abc j<=s.length, j =i+1

// i=1 j=2 -> b
// i=1 j=3 -> bc 

// i=2 j=3 -> c 




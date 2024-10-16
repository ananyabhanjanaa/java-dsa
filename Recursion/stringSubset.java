package Recursion;
import java.util.Scanner;
import java.util.ArrayList;

public class stringSubset {
    static ArrayList<String> arr = new ArrayList<>();
    public static void printSubset(int i, String s, String ans)
    {
        if(i==s.length())
        {
            arr.add(ans);
            return;
        }
        char ch = s.charAt(i);
        printSubset(i+1, s, ans);
        ans+=ch;
        printSubset(i+1, s, ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        printSubset(0,s,"");
        System.out.println(arr);
    }
}

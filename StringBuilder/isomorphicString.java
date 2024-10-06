package StringBuilder;
import java.util.Scanner;
public class isomorphicString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder(sc.nextLine());
        StringBuilder t = new StringBuilder(sc.nextLine());
        int[] arr = new int[26];
        for(int i=0;i<s.length();i++)
        {
            char th = t.charAt(i);
            char ch = s.charAt(i);
            int index = ch - 'a';
            arr[index] = (char)th;
        }
        
        // for(int i=0;i<arr.length;i++)
        // {
        //     System.out.println(arr[i] + " ");
        // }


    }
}

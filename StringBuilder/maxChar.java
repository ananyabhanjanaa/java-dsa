package StringBuilder;
import java.util.Scanner;
import java.util.*;
public class maxChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder(sc.nextLine());
        int[] arr = new int[26];
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            int index = ch - 'a';
            arr[index]++;
    }
    int max = 0;
    for(int i=0;i<26;i++)
    {
        max = Math.max(max, arr[i]);
    }
    System.out.println(max);
    }
}

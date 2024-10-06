package arrays;
import java.util.Scanner;
import java.util.Arrays;
public class smallLarge {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int[] newarr =new int[2];
        newarr[0] = arr[0];
        newarr[1] = arr[arr.length-1];
        for(int i =0;i<2;i++)
        {
            System.out.print(newarr[i]+" ");
        }
    }
}

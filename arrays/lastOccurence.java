package arrays;
import java.util.Scanner;
public class lastOccurence {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("enter the number = ");
        int x = sc.nextInt();
        int count =0;
        for(int i =0;i<n;i++)
        {
            if(arr[i]==x)
            {
                count = i;
            }
        }
        System.out.println("last occ is "+ count);
    }

}

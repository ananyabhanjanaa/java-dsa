package arrays;
import java.util.Scanner;
public class repeatingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int num =0;
        for(int i=0;i<n-1;i++)
        {
            for(int j =i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    num = arr[i];
                    break;
                }
            }
        }
        System.out.print("the repeated element is "+ num);
    }
}

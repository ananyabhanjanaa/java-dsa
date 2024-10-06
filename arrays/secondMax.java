package arrays;
import java.util.Scanner;
public class secondMax {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max, smax;
        max = smax = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]> max)
            {
                smax = max;
                max = arr[i];
            }
            else if(arr[i] >smax && arr[i]!=max)
            {
                smax = arr[i];
            }
        }
        System.out.print("second largest element is: "+ smax);
    }
}

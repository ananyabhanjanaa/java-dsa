package arrays;
import java.util.Scanner;
public class uniqueElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    arr[i] =arr[j] =-1;
                }
            }
        }
        int num =0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=-1)
            {
                num=arr[i];
            }
        }
        System.out.print("unique element is "+num);
    }
}

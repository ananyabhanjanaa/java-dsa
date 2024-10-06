package arrays;
import java.util.Scanner;
public class elementPresent {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        boolean pres = false;
        int value=0;
        int x = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x)
            {
                pres = true;
                value =i;
                break;
            }
        }
        if(pres)
        {
            System.out.print(value);
        }
        else{
            System.out.print("-1");
        }
    }
}

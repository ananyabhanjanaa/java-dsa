package arrays;
import java.util.Scanner;
public class freqOfElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++)
        {
            arr[i] =sc.nextInt();
        }
        System.out.print("Enter the number = ");
        int x = sc.nextInt();
        int count =0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x)
            {
                count++;
            }
        }
        System.out.println("the frequency of "+x+" is "+ count);
    }
}

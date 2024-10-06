package arrays;

import java.util.Scanner;

public class targetsum1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++)
        {
            arr[i] =sc.nextInt();
        }
        System.out.print("Enter the targetsum = ");
        int sum = sc.nextInt();
        int count =0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j]==sum)
                {
                    count++;
                }
            }
        }
        int count2=0;
        System.out.println("pairs are: "+count);
        for(int i=0;i<n-2;i++)
        {
            for(int j=i+1;j<n-1;j++)
            {
                for(int k =j+1;k<n;k++)
                {
                    if(arr[i]+arr[j]+arr[k]==sum)
                {
                    count2++;
                }
                }
            }
        }
        System.out.println("ttriplets are: "+count2);

    }
}

package arrays;

import java.util.Arrays;
public class arrayClone {
    public static void main(String[] args)
    {
        int[] arr1 = {1,2,3,4,5};

        //copyOf (Cloning)
        int[] arr2 = Arrays.copyOf(arr1,3);
        for(int i=0;i<arr2.length;i++)
        {
            System.out.print(arr2[i]+ " ");
        }
        System.out.println("\n");

        //copyOfRange
        int[] arr3 = Arrays.copyOfRange(arr1,1,3);
        for(int i=0;i<arr3.length;i++)
        {
            System.out.print(arr3[i]+ " ");
        }
    }
}

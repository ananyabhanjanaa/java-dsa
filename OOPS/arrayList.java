package OOPS;

import java.util.Arrays;

//import java.util.ArrayList;

public class arrayList {
    public static class arraylist{
        int[] arr = new int[2];
        int index = 0;
        int size = 0;

        public void add(int num)
        {
            if(size ==arr.length)
            {
                int[] newarr = Arrays.copyOf(arr, arr.length*2);
                // arr = new int[newarr.length];
                // arr = Arrays.copyOf(newarr, newarr.length);
                arr = newarr;
            }

            arr[index] = num;
            index++;
            size++;
        }
    }
    public static void main(String[] args) {
        // ArrayList<Integer> arr = new ArrayList<>();
        // arr.add(1);
        // arr.add(11);
        // arr.add(12);
        // arr.add(15);
        // System.out.println(arr);
        // arr.remove(1);
        // System.out.println(arr);
        
        // making an arraylist on our own

        arraylist a = new arraylist();
        a.add(12);
        a.add(40);
        a.add(39);
        // WRONG--->System.out.println(a.arr);
        System.out.println(Arrays.toString(a.arr));

        //When you print the array using System.out.println(a.arr);, it will print the array’s memory address instead of its contents. You should use Arrays.toString(a.arr) to print the array elements.
        //The Arrays class in Java provides a toString method specifically designed to convert an array to a readable string format. When you use Arrays.toString(a.arr), it returns a string representation of the array’s contents, formatted as a comma-separated list enclosed in square brackets.

    }
}

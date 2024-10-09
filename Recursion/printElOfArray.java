package Recursion;

public class printElOfArray {
    public static void print(int i, int[] arr) {
        if(i==arr.length) return;
        System.out.println(arr[i]+" ");
        print(i+1,arr);
    }
    public static void main(String[] args) {
        int[] arr = {4,7,55,24,85,34,53};
        print(0,arr);
    }
}

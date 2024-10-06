package Strings;
import java.util.Scanner;

public class charArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //character arrays:
        char[] charArr = new char[6];
        char[] charArr2 = {'a','n','a','n','y','a'};

        for(int i = 0; i < charArr.length; i++) {
            charArr[i] = sc.next().charAt(0);
        }

        System.out.println(charArr);
        System.out.println(charArr2);


    }
}

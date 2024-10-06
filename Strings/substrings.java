package Strings;

public class substrings {
    public static void main(String[] args) {
        String s = "abcd";
        System.out.println(s.substring(2));
        // index 2 (inclusive) se end tak string jaaygi

        System.out.println(s.substring(1,4));
        // index 1 (inclusive) se 4 (exclusive) means 1,2,3 index char will be printed

        System.out.println(s.substring(2,2));
        // when starting and ending index is same, kuch bhi print nahi hoga

        
        System.out.println(s.substring(0,4));
        //prints whole string 0,1,2,3

       

    }
}

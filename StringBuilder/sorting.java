package StringBuilder;
import java.util.Arrays;
public class sorting {
    public static void main(String[] args) {
        String s = "ananya";
        //we cant sort a string directly using sort, we have to change it into character array and then use direct sort method

        // char[] charArray = myString.toCharArray();
        char[] arr = s.toCharArray();
        
        Arrays.sort(arr);
        System.out.println(arr);

        // Stringbuilders also dont have direct sorting methods, we have to convert stringbuilder to first string and then string to char array to actually sort it
        StringBuilder sb = new StringBuilder("bhanjana");

        char[] arr2 = sb.toString().toCharArray();

        Arrays.sort(arr2);
        System.out.println(arr2);
    }
}

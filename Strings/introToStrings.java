package Strings;
import java.util.Scanner;
public class introToStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "Ananya Bhanjana";
        System.out.println(name);

        String momname = sc.next(); //This method reads the next token (word) from the input.
        System.out.println(momname);

        sc.nextLine(); 

        String dadname = sc.nextLine(); //This method reads the entire line from the input.
        System.out.println(dadname);

        //charAt();
        System.out.println(name.charAt(7));
        // space is also considered at a character, so uska index is also considered

        //length();
        System.out.println(name.length()); // op-> 15
    }
}

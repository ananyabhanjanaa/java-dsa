package Strings;

public class startsWith {
    public static void main(String[] args) {
        String s = "Ananya Bhanjana";

        //startsWith();-> string starts with substring
        System.out.println(s.startsWith("ana")); // false
        System.out.println(s.startsWith("Ana")); //true
        System.out.println(s.startsWith("Ananya Bh"));// true
        System.out.println(s.startsWith("A")); // true

        //contains();-> string contains a continuous substring
        System.out.println(s.contains("ana"));
        System.out.println(s.contains("nnya")); // continuous string hona chaiye tabhi true aayga
        System.out.println(s.contains(" Bha")); // space can also be entered
        System.out.println(s.contains(" ")); // true
        System.out.println(s.contains("ah"));
    }
}

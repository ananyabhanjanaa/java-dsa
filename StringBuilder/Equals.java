package StringBuilder;

public class Equals {
    public static void main(String[] args) {
        String s = "abcxyz";
        String a = "abcxyz"; // no new string created, a and s pointing at the same string only

        String b = new String(s); //new string created using new keyword, s is passed meaning s ki value ki new string create hue, a new string called b = "abcxyz"
        String c = "abc";
        c += "xyz";

        // == operator --> strings ki value nahi balki address(memory location) compare hota hai, if same location only then
        // true and agar diff strings ho to false
        //primitive datatypes like int, float me siraf value hi compare krta hai == hence works fine there but we dont use == here in strings
        System.out.println(s==a); // bcz same string ko point kr rhe hai, address(memory location will be same)
        System.out.println(s==b); // diff add bcz new string created
        System.out.println(s==c); // diff add bcz new string created
        

        //equals() --> char ka sequence compare hota hai baari baari se
        System.out.println(s.equals(a)); 
        System.out.println(s.equals(b));
        System.out.println(s.equals(c));
       
    }
}

package Strings;

public class plusOperator {
    public static void main(String[] args) {
        String s = "abc";
        String str = "xyz";
        System.out.println(s+str);

        s = s + 100;
        System.out.println(s);
        s = 5 + s; // 5aage lag jayga string ke
        System.out.println(s);
        

        str = str + 'h';
        System.out.println(str);

        System.out.println("i am "+ 10 + 20); //i am 1020

        // if we add a string, int or char to a string then we get back a string only

        System.out.println(10 + 20 + "ananya" ); // 30ananya

        // whenever we have string+int or int+string, we will get string only but in second example, we had 10+20+"string" toh precedence ke according left to right calculate hoga java me and sabse pehle dekha ki 10 hai which is int and 20 hai which is int, so int+int =10 + 20 = 30 which is int then dekha aage toh string padha hua hai so 30 + ananya = will give us string only bcz int + s = string




    }
}

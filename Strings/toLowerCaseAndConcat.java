package Strings;

public class toLowerCaseAndConcat {
    public static void main(String[] args) {
        String s = "AnaNyA bhANjAna";
        s.toLowerCase();
        System.out.println(s);
        // nothing will happen just by s.toLowerCase();--> we would have to store it in some other string and then print or print directly like 
        System.out.println(s.toLowerCase());// is se permanent changes nahi aate string me 

        // toUpperCase -> by storing into some other string
        s = s.toUpperCase(); //--> s ko hi update kar dia basically, lekin is se aayge permanent changes string me
        System.out.println(s);


        String a = "abc";
        String b = "xyz";
        // one way-> sout(a+b);
        a.concat(b); 
        // siraf ye likhne se koi change nhi aayge string me, we would have to update it (store it) tabhi permanent changes aayge, otherwise agar just print krna hai concatenated string toh sout me concat likhdo
        System.out.println(a);
        System.out.println(a.concat(b));
        System.out.println(a);
        a = a.concat(b);
        System.out.println(b.concat(a));
    }
}

package OOPS2;

// A wrapper class in Java is a class that encapsulates (or “wraps”) a primitive data type into an object. This allows primitive data types to be used in contexts that require objects, such as in collections (e.g., ArrayList, HashMap). Each primitive data type in Java has a corresponding wrapper class:

// byte -> Byte
// short -> Short
// int -> Integer

//Final Keyword-> When a variable is declared with the final keyword, itsvalue can’t be changed, essentially, aconstant. This also means that you must initialize a final variable
public class wrapperClass {
    public static void swap(Integer a, Integer b)
        {
            int temp=a;
            a = b;
            b = temp;
        }
    public static void main(String[] args) {

        // java me pass by reference jaisa kuch nahi hota like in c++ so we can create them seedha into objects
        Integer a = 10; // a and b will be treated as objects
        Integer b = 20;

        swap(a, b);

       
    }
}

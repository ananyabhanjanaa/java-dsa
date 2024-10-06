package OOPS;
public class fractionClass {
    public static Fraction add(Fraction f1, Fraction f2)
    {
        int numerator = f1.num*f2.den + f1.den*f2.num;
        int denominator = f1.den*f2.den;
        Fraction f3 = new Fraction(numerator, denominator);
        return f3;
        
    }

    public static Fraction sub(Fraction f1, Fraction f2)
    {
        int numerator = Math.abs(f1.num*f2.den - f2.num*f1.num);
        int denominator = f1.den*f2.den;
        Fraction f3 = new Fraction(numerator, denominator);
        return f3;
    }
    public static int highest(int a,int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void simplify(Fraction fraction) {
        int hcf = highest(fraction.num, fraction.den);
        fraction.num = fraction.num / hcf;
        fraction.den = fraction.den / hcf;
    }

    public static class Fraction{
        int num;
        int den;

        public Fraction(int num, int den)
        {
            this.num = num;
            this.den = den;
            simplify(this);
            //In Java, this is a reference to the current object. When you call simplify(this);, you are passing the current Fraction object to the simplify method.
        }
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(21,7);
        System.out.println(f1.num+"/"+f1.den);

        Fraction f2 = new Fraction(7,3);
        System.out.println(f2.num+"/"+f2.den);

        Fraction f3 = add(f1, f2);
        System.out.println(f3.num+"/"+f3.den);

        Fraction f4 = sub(f1,f2);
        System.out.println(f4.num+"/"+f4.den);

    }
}

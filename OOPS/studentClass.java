package OOPS;

public class studentClass {
    //creating a new data type
    // public static class Student{
    //     String name;
    //     int rno;
    //     double percent;
    // }
    public static void change(int x){
        x = 7;
        return;
    }
    public static void changeClass(Student s)
    {
        s.name = "ananya";
        s.rno = 45;
        return;
    }
    public static void main(String[] args){
        //creating object x
        Student x = new Student();
        x.name = "Raghav";
        x.rno = 76;
        x.percent = 92.6;
        System.out.println(x.name);
        System.out.println(x.rno + 100); // 76 + 100 = 176

        //creating object y
        Student y = new Student();
        y.name = "Bhavya";
        y.rno = 11;
        y.percent =98;

        //call by value
        System.out.println(x.rno);
        change(x.rno);
        System.out.println(x.rno);

        //call by reference: passing class into a function: object is passed as a parameter
        changeClass(x);
        System.out.println(x.rno);
        System.out.println(x.name);

        //creating an object but not initializing the values
        // default values 
        Student z = new Student();
        System.out.println(z.name);
        System.out.println(z.rno);
        System.out.println(z.percent);

        //calling getter and setter functions
        x.setage(15);
        int years = x.getage();
        System.out.println(years);


    }
}

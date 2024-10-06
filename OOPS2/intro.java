package OOPS2;

import arrays.lastOccurence;

public class intro  {
    
    public static void main(String[] args) {
        Student student1 = new Student(1,"Ananya",89);
        student1.greet();
        Student student2 = new Student(2,"Bhavya",90);

        System.out.println(student1.rollno+"  "+student1.name+"    "+student1.marks);
        System.out.println(student2.rollno+"    "+student2.name+"   "+student2.marks);

       // Student student3 = new Student();-> we cannot call an empty constructor(defualt one) bcz when we create our own constructor, java ka default constructor will be removed and hume khud se empty constructor bana na padega(one with no arguments)

       Student student3 = new Student(student2); //now student2 ki values will go inside student3
       System.out.println(student3.rollno+"  "+student3.name+"    "+student3.marks);
       student2.name = "Monica Jaggi"; //-> only student 2 ka name change hoga student 3 ka nahi
       System.out.println(student2.rollno+"  "+student2.name+"    "+student2.marks);
       System.out.println(student3.rollno+"  "+student3.name+"    "+student3.marks);

    //    student1.name = student2.name;
    //    System.out.println(student1.name);
    //    student1.name = "Jatinder";
    //    System.out.println(student2.name); // student1 me changes wont affect student2 ka changes

       //but when we create an object with new keyword 
       Student stu = new Student();  //This line creates a new Student object and assigns it to stu.

      // Now, stu no longer references the new Student object created earlier. Instead, it references the same object as student1.
       stu = student1; 
       System.out.println("stu name is " +stu.name);
       stu.name = "new name"; 

       //Since stu and student1 reference the same object, changing stu.name also changes student1.name.
       System.out.println(stu.name);
       System.out.println(student1.name);

       student2 = student1 ; // bcz of same reason, dono objects ab same jagah point kr rhe hai, so ek ko change karege toh doosra change ho jayga

       // but it wont happen if we do smthg like student1.name = student2.name , us se dono alag alag hi rhege and ek me changes wont affect doosre me changes

       //heap me same memory me tabhi pony karege dono objects if we do smgth like obj1 = obj2
       
       student2.name = "namuna";
       System.out.println(student1.name+"   "+ student2.name);
       
    }
}

class Student{
    int rollno;
    String name;
    int marks;

    void greet(){
        System.out.println("hello" + this.name);
    }
    //constructor:
    Student(int rollno, String name, int marks){
        this.rollno=rollno;
        this.name = name;
        this.marks=marks;
    }
    Student(){

    }
    //creating another constructor and passsing object as an argument into it (object argument ki values will be saved in the new object ki values)
    Student(Student other){
        this.rollno = other.rollno;
        this.name = other.name;
        this.marks = other.marks;
    }
}
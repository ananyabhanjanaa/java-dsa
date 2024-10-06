package OOPS;

public class construct {
    public static class Person{
        String name;
        private int age;
        final String college = "Chitkara";
        static int numOfStudents;

        //Constructor:
        public Person(String name, int age)
        {
            this.name = name;
            this.age = age;
             numOfStudents++;
        }
    }
    public static void main(String[] args) {
        Person p1 = new Person("ananya", 21);
        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println(p1.college);

       

        p1.name = "bhavya";
        System.out.println(p1.name);

        //p1.college = "something else";
        // cant change college name because it is final

        //calling static variable-> using classname ->jaise hi constructor call hoga vaise hi increment hoga each time an object is created -> o/p-> 1  2   3
        // and agar static na hota numOfStudents toh hume use object ke sath call karte (instance variable) and uska value change na hota same hi rehta-> o/p -> 1
        System.out.println(Person.numOfStudents);

        Person p2 = new Person("bhavya", 13);
        System.out.println(Person.numOfStudents);

        Person p3 = new Person("mona", 48);
        System.out.println(Person.numOfStudents);


    }
}

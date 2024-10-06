package OOPS;

public class Student {
        String name;
        int rno;
        double percent;
        private int age;

        //setter
        public void setage(int years)
        {
            age = years;
        }

        //this keyword
        // public void setage(int age)
        // {
        //     this.age = age;
        // }

        //getter
        public int getage()
        {
            return age;
        }
}

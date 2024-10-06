package OOPS2;

public class boxClass {
    public static class Box{
        int length;
        int width;
        int height;

        Box(){
            this.length=-1;
            this.width =-1;
            this.height =-1;
        }

        Box(int l,int w, int h)
        {
            this.length=l;
            this.width =w;
            this.height =h;
        }

        //cube
        Box(int a)
        {
            this.length=a;
            this.width =a;
            this.height =a;
        }

        Box(Box oldbox)
        {
            this.length=oldbox.length;
            this.width =oldbox.width;
            this.height =oldbox.height;
        }

    }

    //public child class extends baseclassname
    public static class Boxchild extends Box{
        int weight;

        Boxchild()
        {
            this.weight =-1;
        }
        Boxchild(int l, int w, int h, int wt)
        {
            super(l,w,h);
            //The java super keyword is used to refer the immediate parent class object.

            this.weight = wt;
        }
    }

    public static void main(String[] args) {
        
        Box box1 = new Box();
        Box box2 = new Box(12,13,15);
        Boxchild box3 = new Boxchild(1,33,45,66);
        System.out.println(box1.height+" "+ box3.weight);

    }
}

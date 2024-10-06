package StringBuilder;
import java.util.Scanner;
public class palindromString {
    public static void main(String[] args) {
        
        //Better method of finding a palindrom string
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int start = 0;
        int end = s.length()-1;
        
        boolean flag = true;
        //using two pointer method
        while(start<=end)
        {
            if(s.charAt(start)!=s.charAt(end))
            {
                flag =  false;
                break;
            }
            start++;
            end--;
        }
        if(flag==false)
        {
            System.out.println("not a palindrom");
        }
        else{
            System.out.println("palindrom");
        }

    }
}

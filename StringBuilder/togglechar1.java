package StringBuilder;
import java.util.Scanner;
public class togglechar1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        for(int i=0;i<sb.length();i++)
        {
            char ch = sb.charAt(i);
            if(ch>='A' && ch <='Z')
            {
                sb.setCharAt(i, (char)(ch+32));

            }
            else if(ch>='a' && ch <='z')
            {
                sb.setCharAt(i, (char)(ch-32));
            }
        }
        System.out.println(sb);

    }
}

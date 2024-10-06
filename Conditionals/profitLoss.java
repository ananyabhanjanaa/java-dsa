package Conditionals;
import java.util.Scanner;
public class profitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cp = sc.nextInt();
        int sp = sc.nextInt();
        if(cp==sp){
            System.out.println("neither profit nor loss");
        }
        else if(cp>sp){
            System.out.println("Loss of: "+ (cp-sp));
        }
        else{
            System.out.println("Profit of: "+ (sp-cp));
        }
    }
}

package stringapplication;
import java.util.Scanner;
public class StringApplication {
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a;
        a = input.nextLine();//5
        System.out.println("REVERSE INPUT IS");
        for(int i=a.length()-1; i>=0 ;i--  ){
        System.out.print(a.charAt(i));
        }
    System.out.println();
    }
}


package table;
import java.util.Scanner;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;
/**
 *
 * @author bakhtiyar
 */
public class Table {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        
        
        
        try{
        
        System.out.print("\t**+WELCOME TO TABLE+**\n");
        System.out.println("ENTER A NUMBER WHAT YOU WANT: ");
        a=input.nextInt();
        System.out.println("ENTER A NUMBER WHAT TIMES: ");
        b=input.nextInt();
        multi(a,b);
       }catch(InputMismatchException h){
       JOptionPane.showMessageDialog(null, "enter invalid command");
       }
        
    }
    public static void multi(int x,int times){
    for(int i=1;i<=times;i++){
    int temp = x*i;
    System.out.printf("\n\t%d X %d = %d\n",x,i,temp);
    
    }
    
    }
    
}

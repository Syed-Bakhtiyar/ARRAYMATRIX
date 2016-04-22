/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicalbool;
import java.util.Scanner;
/**
 *
 * @author bakhtiyar
 */
public class LogicalBool {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean a,b; 
        int choice;
        a = input.nextBoolean();
        b= input.nextBoolean();
        System.out.println("1.AND\n2.OR\n3.XOR\n");
        System.out.print("ENTER CHOICE: ");
        choice = input.nextInt();
        if(choice==1){
            System.out.println("AND GATE IS: "+(a&&b));
        }else if(choice == 2){
            System.out.println("OR GATE IS: "+(a||b));
        }else if(choice == 3){
            System.out.println("XOR GATE IS: "+(a^b));
        }else{
            System.out.println("ENTER WRONG NUMBER\n\n\n\t\t GOT IT?");
        
        }
        
        
                
        }
    
}

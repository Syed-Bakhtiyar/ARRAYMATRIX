/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacktest;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.InputMismatchException;
/**
 *
 * @author bakhtiyar
 */
public class StackTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        StackClass cpy = new StackClass();
        int choice = 0,bound=0;
        do{
            Scanner input = new Scanner(System.in);
            System.out.println("1. insert data\n2. search\n3. sort\n4. display\n5. delete\n6. exit");
            try{
            choice = input.nextInt();
            }catch(InputMismatchException a){
            System.out.println("input only nuber to select");
            }
            switch(choice){
                case 1:
                    int ins ;
                    System.out.println("ENTER DATA: ");
                    try{
                    ins = input.nextInt();
                    cpy.insert(ins);
                    }catch(InputMismatchException a){
                       JOptionPane.showMessageDialog(null, "enter only number "+ a);
                        //System.err.println(a);
                        System.out.println("enter only number");
                    }
                   
                    break;
                   
                case 2:
                    System.out.println("ENTER NUMBER FOR SEARCH:");
                    try{
                    int find = input.nextInt();
                    cpy.search(find);
                    }catch(InputMismatchException a){
                    System.out.println("ENTER ONLY NUMBER TO FIND ");
                    }
                    break;
                case 3:
                    System.out.println("SORT DATA:");
                    cpy.sortingDisplay();
                    break;
                    
                case 4:
                    cpy.display();
                    break;
                    
                case 5:
                    cpy.delt();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("ENTER INVALID CHOICE");
                }
            bound++;
                           
        }while(bound<10);
    }
}

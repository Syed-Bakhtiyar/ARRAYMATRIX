/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacktest;
import java.util.Scanner;
/**
 *
 * @author bakhtiyar
 */
public class StackTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StackClass cpy = new StackClass();
        int choice;
        do{
            System.out.println("1. insert data\n2. search\n3. sort\n4. display\n5. delete\n6. exit");
            choice = input.nextInt();
            switch(choice){
                case 1:
                    System.out.println("ENTER DATA: ");
                    int ins = input.nextInt();
                    cpy.insert(ins);
                    break;
                   
                case 2:
                    System.out.println("ENTER NUMBER FOR SEARCH:");
                    int find = input.nextInt();
                    cpy.search(find);
                    
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
                    System.out.println("ENTER INVALID COMMAND");
                     
            }
        
        
        }while(true);
    }
    
}

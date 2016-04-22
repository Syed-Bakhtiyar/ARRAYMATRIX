/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackexit;
import java.lang.*;
import java.util.Scanner;
/**
 *
 * @author bakhtiyar
 */
public class StackExit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
    stack b = new stack();
    do{
    System.out.println("1.put\n2.delete\n3.search\n4.sort\n5.display\n6.exit\n");
    int a;
    
    Scanner input = new Scanner(System.in);
    a= input.nextInt();
    switch(a){
        case 1:
        int add;
            add = input.nextInt();        
            b.put(add);
        break;
        case 2:
            b.pop();
        break;
        case 3:
            int find;
            System.out.print("what number do you wan't to search?: ");
            find=input.nextInt();
            b.search(find);
        break;
        case 4:
            b.sort();
        break;
        case 5:
            b.display();
        break;
        case 6:
            System.exit(0);
        break;
        default:
            
    }
    
    } while(true);
    
}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mindgame;
import java.util.Scanner;
import java.security.SecureRandom;
/**
 *
 * @author bakhtiyar
 */
public class MindGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Think any number\npress 1. to next step\npress 2. to next step\npress 3. to next step\npress 4. next step\npress 5. next step\n press 6. i find what you think got it? ");
       int x;
        
       int rand=funct();
       Scanner input = new Scanner(System.in);
       
       System.out.println("THINK ANY NUMBER" +rand);
      
       do{
        x = input.nextInt();
       switch(x){
       
           
           case 1:
               System.out.println("ADD SAME NUMBER WHAT YOU THINK");
               break;
           case 2:
               
               System.out.printf("add %d in number \n",rand);
               break;
           case 3:
               System.out.println("minus half in your total number");
               break;
           case 4:
               System.out.println("minus number what you add in first step");
               break;
           case 5:
               int ans = rand/2;
               System.out.printf("i am sure you think this: %d\n",ans);
               break;
               
       
           default:
       }
      }while(true);
    }
    public static int funct(){
        SecureRandom random = new SecureRandom();
        int temp = random.nextInt(100);
        if(temp%2 == 0){
        return temp;
        }else if(temp%2 != 0){
            temp++;
            return temp;
        }else{
        return temp;
        }
    
    }
    
}

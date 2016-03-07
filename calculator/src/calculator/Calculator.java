/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.util.Scanner;

/**
 *
 * @author bakhtiyar
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int a,b,c,x;
      System.out.println("\t HELLO CALCULATOR\n");
      System.out.println("ENTER CHOICE \n");
      Scanner input = new Scanner(System.in);
      x = input.nextInt();
        if(x==1){
              System.out.print("ENTER FIRST NUMBER: ");
             a = input.nextInt();
            System.out.print("ENTER SECOND NUMBER: ");
            b = input.nextInt();
            c=a+b;
             System.out.printf("%d\n",c);
        } else
        if(x==2){
            System.out.print("ENTER FIRST NUMBER: ");
            a = input.nextInt();
            System.out.print("ENTER SECOND NUMBER: ");
            b= input.nextInt();
            c=a-b;
            System.out.printf("%d\n",c);
            
        } else
        if(x==3){
            System.out.print("ENTER FIRST NUMBER: ");
            a = input.nextInt();
            System.out.print("ENTER SECOND NUMBER: ");
            b= input.nextInt();
            if(b==0){
                System.out.println("\nCannot divide by zero\n");
            }else{
            c=a/b;
            System.out.printf("%d\n",c);
            }
        }else
        if(x==4){
            System.out.print("ENTER FIRST NUMBER: ");
            a = input.nextInt();
            System.out.print("ENTER SECOND NUMBER: ");
            b= input.nextInt();
            c=a*b;
            System.out.printf("%d",c);
        }
        else{
           System.out.println("\n SORRY! YOU HAVE ENTERED AN INVALID COMMAND:");
        }
        
        
    }
    
}

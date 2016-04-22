/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prctc;
import java.util.Scanner;
/**
 *
 * @author bakhtiyar
 */
public class Returningfunct {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double flt;
        Scanner input= new Scanner(System.in);
        int x;
        System.out.println("\t***+FOUR OPERATOR CALCULATOR+***\n");
        System.out.println("1.add two numbers\n2.subtract two numbers\n3.divide two numbers\n4.multiply two numbers\n");
        x = input.nextInt();
        switch (x){
            case 1:
                flt = adding();
                System.out.printf("%s\n",flt);
            break;
            
            case 2:
                flt= min();
                System.out.printf("%.2f\n",flt);
            break;
            case 3:
                flt=divd();
                System.out.printf("%.2f\n",flt);
            break;
            case 4:
                flt=multiplication();
                System.out.printf("%.2f\n",flt);
            break;
                default:
                 System.out.println("enter invalid command");
        }
        }
    public static double adding(){
         Scanner input = new Scanner(System.in);
         double number1=2.0;
         double number2=2.0;
         double c;
         System.out.print("ENTER FIRST NUMBER: ");
         number1 = input.nextDouble();
         System.out.print("ENTER SECOND NUMBER: ");
         number2 = input.nextDouble();
         c=number1+number2;  
         return c;
    }
    public static double min(){
        Scanner input =  new Scanner(System.in);
        double number1;
        double number2;
        double c;
        System.out.print("ENTER FIRST NUMBER: ");
        number1 = input.nextDouble();
        System.out.print("ENTER SECOND NUMBER: ");
        number2 = input.nextDouble();
        c=number1-number2;
        return c;
    }
    public static double divd(){
        Scanner input = new Scanner(System.in);
        double number1;
        double number2;
        double c;
        System.out.print("ENTER FIRST NUMBER: ");
        number1 = input.nextDouble();
        System.out.print("ENTER SECOND NUMBER: ");
        number2 =  input.nextDouble();
            if(number2 == 0){
                System.out.println("CANNOT DIVIDE BY ZERO");
                c='\0';
            }else{
               c = number1/number2;
            }
    return c;
    }
    public static double multiplication(){
        Scanner input = new Scanner(System.in);
        double number1,number2,c;
        System.out.print("ENTER FIRST NUMBER: ");
        number1 = input.nextDouble();
        System.out.print("ENTER SECOND NUMBER: ");
        number2 =input.nextDouble();
        c = number1*number2;
        return c;
    }
    
}

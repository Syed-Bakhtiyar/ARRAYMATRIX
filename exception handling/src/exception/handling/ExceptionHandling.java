/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception.handling;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author bakhtiyar
 */
public class ExceptionHandling {
public static int quotient(int numerator,int denominator){
return numerator/denominator;
}
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueloop = true;
        do{   
            try 
            {
                System.out.print("please enter an integer numerator: ");
                int numerator = input.nextInt();
                System.out.print("please enter an integer denominator: ");
                int denominator = input.nextInt();
                int result = quotient(numerator,denominator);
                System.out.printf("\nResult: %d/%d = %d\n",numerator,denominator,result);
                continueloop = false;
            }
            catch(InputMismatchException inputmismatchexception){
                System.err.printf("\nexception: %s\n",inputmismatchexception);
            input.nextLine();
            System.out.printf("you must enter integers. please try again.\n\n");
            }
            catch(ArithmeticException arithmeticexception){
            System.err.printf("Exception: %s \n",arithmeticexception);
            System.out.printf("zero is an invalid denominator. please try again\n\n");
            }
        }while(continueloop);
    
    }
    
}

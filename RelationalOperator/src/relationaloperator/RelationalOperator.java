/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relationaloperator;
import java.util.Scanner;
/**
 *
 * @author bakhtiyar
 */
public class RelationalOperator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.println("+ - / * >= <= == !=");
        System.out.print("ENTER FIRST NUMBER: ");
        a= input.nextInt();
        System.out.print("ENTER SECOND NUMBER: ");
        b= input.nextInt();
        System.out.println((a+b));
        System.out.println((a-b));
        if(b==0){
        System.out.println("cannot divide by zero");
        }else{
        System.out.println((a/b));
        }
        System.out.println((a*b));
        System.out.println((a>=b));
        System.out.println((a<=b));
        System.out.println((a==b));
        System.out.println((a!=b));
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println((a&b));
        System.out.println((a|b));
        
    }
    
}

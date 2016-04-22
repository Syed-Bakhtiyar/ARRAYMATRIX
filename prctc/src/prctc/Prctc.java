/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



//static means bghai object k banaana
package prctc;
import java.util.Scanner;
/**
 *
 * @author bakhtiyar
 */
public class Prctc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        int b,c;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b=input.nextInt();
        c=a+b;
        System.out.printf("%d\n",c);
        System.out.println("first programm\n");
        double d=Returningfunct.multiplication();
        System.out.println("ANSWER IS: "+d+" yeah!!!");
        FarrukhHello.funct();
    }
    
}

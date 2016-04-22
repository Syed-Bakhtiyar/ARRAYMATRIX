/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package malik;
import java.util.Scanner;
/**
 *
 * @author bakhtiyar
 */
public class Malik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b,c;
        Scanner input= new Scanner(System.in);
        System.out.println("enter first no");
        a=input.nextInt();
        System.out.println("enter 2nd no");
        b=input.nextInt();
        c=a+b;
        System.out.printf("%d",c);
        // TODO code application logic here
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farrukhinput;
import java.util.Scanner;
/**
 *
 * @author bakhtiyar
 */
public class Farrukhinput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner farrukh = new Scanner(System.in);
       
        
        
        
        String ch = farrukh.next();
        char d = ch.charAt(0);
        
        System.out.println(d);
        Scanner abc = new Scanner(System.in);       
        String name = abc.nextLine();
        int a = farrukh.nextInt();
        int b = farrukh.nextInt();
        System.out.println(a+b);
        System.out.println(name);
    }
    
}

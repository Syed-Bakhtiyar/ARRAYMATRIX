/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package averarrclass;
import java.util.Scanner;
/**
 *
 * @author bakhtiyar
 */
public class Averarrclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       arrr b = new arrr();
       int[] avr = new int[10];
       for(int i=0;i<10;i++){
       avr[i]= input.nextInt();
       }
       b.inp(avr);
       System.out.printf("average is: %d",b.avr());
       
    }
    
}

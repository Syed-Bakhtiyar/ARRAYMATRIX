/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avrclass;
import java.util.Scanner;
/**
 *
 * @author bakhtiyar
 */
public class Avrclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    final int ln=10;
    int[] avrray= new int[ln];
    int i;
    for(i=0;i<ln;i++){
    avrray[i] = input.nextInt();
    } 
    firstClass ab = new firstClass();
    ab.setarr(avrray,ln);
    System.out.printf("\n average is: %d",ab.getarr(ln));
    }
    
}

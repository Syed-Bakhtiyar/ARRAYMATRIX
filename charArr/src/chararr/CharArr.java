/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chararr;
import java.util.Scanner;
/**
 *
 * @author bakhtiyar
 */
public class CharArr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[] charr = new char[80];
        int i=0;
        Scanner input = new Scanner(System.in);
        String ch = input.next();
        for(i=0;i<charr.length;i++){
           charr[i]=ch.charAt(0);
           }
        for(i=0;i<charr.length;i++){
            System.out.printf("%c",charr[i]);
        }
    }
    
}

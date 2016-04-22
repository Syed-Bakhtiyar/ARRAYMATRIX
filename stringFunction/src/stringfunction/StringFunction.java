/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringfunction;
import java.util.Scanner;
/**
 *
 * @author bakhtiyar
 */
public class StringFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name,name2;
        System.out.printf("ENTER FIRST SENTENCE%n");
        name = input.nextLine();
        System.out.printf("ENTER SECOND SENTENCE%n");
        name2 = input.nextLine();
    stringfunctioncall bak = new stringfunctioncall();
    bak.add(name, name2);
    System.out.printf("comparison is: %d\n",bak.comp());
    bak.concat();
    bak.length();
    }
    
}

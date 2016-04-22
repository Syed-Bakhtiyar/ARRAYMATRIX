/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inttochar;
import java .util.Scanner;
/**
 *
 * @author bakhtiyar
 */
public class IntToCharc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER NUMBER TO FIND ASCII: ");
        int a = input.nextInt();
        System.out.printf("%c\n",a);
    }
    
}

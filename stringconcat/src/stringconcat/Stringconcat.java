/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringconcat;
import java.util.Scanner;
/**
 *
 * @author bakhtiyar
 */
public class Stringconcat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        strcnt z = new strcnt();
        Scanner input=new Scanner (System.in);
        String word1,word2;
        System.out.println("ENTER FIRST SENTENCE: ");
        word1 = input.nextLine();
        System.out.println("ENTER SECOND SENTENCE: ");
        word2 = input.nextLine();
        z.set(word1,word2);
        System.out.printf("after concatenation: %s\n",z.get());
        
    }
    
}

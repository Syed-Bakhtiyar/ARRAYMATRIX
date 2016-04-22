/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomnumbers1;
import java.util.Scanner;
import java.security.SecureRandom;
/**
 *
 * @author bakhtiyar
 */
public class RandomNumbers1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int h =10;
        Scanner input = new Scanner(System.in);
        SecureRandom a = new SecureRandom();
        for(int i=0;i<h;i++){
        int rand = a.nextInt(h);
        System.out.printf("%d\n",rand);
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise17_1textfiling;
import java.io.*;
import java.security.SecureRandom;
/**
 *
 * @author bakhtiyar
 */
public class Exercise17_1TextFiling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SecureRandom rand = new SecureRandom();
        try(PrintWriter out = new PrintWriter("D:\\BAKHTIYAR\\JavaFilingPractice\\Ex.txt")){
            for(int i=0;i<100;i++){
            int j = rand.nextInt(100);
            
            out.print(j+" ");
           // out.write(" ");
            }
        
        
        }catch(Exception ex){
        System.out.println("can't write t a file");
        }
    }
    
}

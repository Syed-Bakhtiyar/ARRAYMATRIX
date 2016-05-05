/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise17_2binaryfiling;
import java.io.*;
import java.security.SecureRandom;
/**
 *
 * @author bakhtiyar
 */
public class Exercise17_2Binaryfiling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SecureRandom rand = new SecureRandom();
        try(DataOutputStream data = new DataOutputStream(new FileOutputStream("D:\\BAKHTIYAR\\JavaFilingPractice\\Ex2.DAT"))){
            for(int i=0;i<100;i++){
            int j = rand.nextInt(100);
            data.writeInt(j);
            }
            data.close();
        }catch(Exception ex){
            System.out.println("Write Complete");
        }
    }
    
}

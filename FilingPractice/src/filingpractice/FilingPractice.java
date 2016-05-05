/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filingpractice;
import java.io.*;
import java.security.SecureRandom;
/**
 *
 * @author bakhtiyar
 */
public class FilingPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SecureRandom rand = new SecureRandom();
        int[] arr = new int[10];
        int x =0;
        for(int i: arr){
        arr[x] = rand.nextInt(100);
        x++;
        }
       try(DataOutputStream data= new DataOutputStream(new FileOutputStream("D:\\BAKHTIYAR\\JavaFilingPractice\\arr.dat"))){
       x=0;
        while(true){
            data.writeInt(arr[x]);
       x++;
       }
       
             
}
       
       
       catch(Exception ex){
       System.out.println("write complete");
       
       
       }
       try(DataInputStream input = new DataInputStream(new FileInputStream("D:\\BAKHTIYAR\\JavaFilingPractice\\arr.dat"))){
       int var;
        while((var = input.readInt())!=-1){
            System.out.println(var);
       
       }
       
       }catch(Exception ex){
           System.out.println("read complete");
       
       }
    }
    
}

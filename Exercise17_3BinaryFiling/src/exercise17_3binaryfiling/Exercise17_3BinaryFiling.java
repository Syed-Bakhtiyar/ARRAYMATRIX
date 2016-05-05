/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise17_3binaryfiling;
import java.io.*;
/**
 *
 * @author bakhtiyar
 */
public class Exercise17_3BinaryFiling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int temp=0;
        try(DataInputStream input = new DataInputStream(new FileInputStream("D:\\BAKHTIYAR\\JavaFilingPractice\\Ex2.DAT"))){
           int var;
            while((var = input.readInt())!=-1){
           temp+=var;
           }
        
        }
        catch(Exception ex){
        System.out.println("Sum is: "+temp);
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise17_5;
import java.io.*;
import java.util.Date;
/**
 *
 * @author bakhtiyar
 */
public class Exercise17_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date date = new Date();
        int[] arr = {1,2,3,4,5};
        try(ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("D:\\BAKHTIYAR\\JavaFilingPractice\\Ex17_5.DAT"))){
            obj.writeObject(arr);
            obj.writeObject(date);
            obj.writeDouble(5.5);
        }catch(Exception ex){
        System.out.println("cant write");
        }
    }
    
}

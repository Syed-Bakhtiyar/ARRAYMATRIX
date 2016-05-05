/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise17_4binaryfiling;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author bakhtiyar
 */
public class Exercise17_4BinaryFiling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        try(Scanner input = new Scanner("D:\\BAKHTIYAR\\JavaFilingPractice\\abc.txt")){
            ObjectOutputStream data = new ObjectOutputStream(new FileOutputStream("D:\\BAKHTIYAR\\JavaFilingPractice\\copy.dat"));
            String temp = input.nextLine();
            data.writeUTF(temp);
            System.out.println(temp.length());
           // System.out.println(data.);
       }catch(Exception ex){
       
       }
    }
    
}

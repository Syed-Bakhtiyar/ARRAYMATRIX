/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readclasscontentfiling;
import java.io.*;
/**
 *
 * @author bakhtiyar
 */
public class ReadClassContentFiling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try(ObjectInputStream inp = new ObjectInputStream(new FileInputStream("C:\\Users\\bakhtiyar\\Documents\\NetBeansProjects\\StackTest\\src\\stacktest\\StackTest.class"))){
       while(true){
       char ch = (char) inp.readByte();
       System.out.println(ch);
       
       }
       
       }catch(Exception a){}
    }
    
}

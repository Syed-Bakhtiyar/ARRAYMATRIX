/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readonlyclassfiling;

import java.io.RandomAccessFile;

/**
 *
 * @author bakhtiyar
 */
public class ReadOnlyClassFiling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try(RandomAccessFile r = new RandomAccessFile("C:\\Users\\bakhtiyar\\Documents\\NetBeansProjects\\StackTest\\src\\stacktest\\StackTest.class", "r");){
    while(true){
     
    System.out.print((char )r.readByte());
    }    
    }catch(Exception ex){
        System.out.println("//read complete");
    }
    }
    
}

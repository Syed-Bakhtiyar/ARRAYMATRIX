/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomaccessfileraedonly;
import java.io.*;

/**
 *
 * @author bakhtiyar
 */
public class RandomAccessFileRaedOnly {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    try(RandomAccessFile r = new RandomAccessFile("D:\\BAKHTIYAR\\back ground\\ASSIGN~1.CPP", "r");){
    while(true){
     
    System.out.print((char )r.readByte());
    }    
    }catch(Exception ex){
        System.out.println("//read complete");
    }
    
    
    
    }
    
}

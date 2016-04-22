/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarydatawriteread;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author bakhtiyar
 */
public class BinaryDataWriteRead {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int arr[] = new int[10];
        int i=0,choice;
        System.out.println("1.write Data\n2.read Data");
        
        choice = input.nextInt();
        if(choice == 1){
        for(int v:arr){
            arr[i] = input.nextInt();
            i++;
        }
        try {
            DataOutputStream dout = new DataOutputStream(new FileOutputStream("D:\\BAKHTIYAR\\JavaFilingPractice\\CAL.DAT"));
            try {
                for(i=0;i<arr.length;i++){
                    dout.writeInt(arr[i]);
                }
            } catch (IOException ex) {
               System.out.println("can't write file");
            }

        } catch (FileNotFoundException ex) {
           System.out.println("File not Found"); 
        }
        }else if(choice ==2){
        
        
        
        try {
                DataInputStream din = new DataInputStream(new FileInputStream("D:\\BAKHTIYAR\\JavaFilingPractice\\CAL.DAT"));
             
                System.out.println("Bytes are available "+din.available());
                System.out.println("(______________________) ");
                i=0;
                try{
                while(i<arr.length){
                arr[i]=din.readInt();
                System.out.println(arr[i]);
                }
            }
            catch(IOException a){
                System.out.println("reading complete");
            }
            
            
        } catch (FileNotFoundException ex) {
           System.out.println("File not Found"); 
        }
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarandomaccessfiling;
import java.io.*;
import java.security.SecureRandom;
import java.util.Scanner;
/**
 *
 * @author bakhtiyar
 */
public class JavaRandomAccessFiling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       SecureRandom randi = new SecureRandom();
      Scanner inp= new Scanner(System.in);
       int[] arr = new int[10];
       int i,choice;
       for(i=0;i<arr.length;i++){
           arr[i] = randi.nextInt(100);
       }
       try( RandomAccessFile rand = new RandomAccessFile("D:\\BAKHTIYAR\\JavaFilingPractice\\harami.ser", "rw");){
       choice = inp.nextInt();
        switch(choice){
            case 1:
                i=0;
                while(i<arr.length){

                     rand.writeInt(arr[i]);
                     i++;
                }
            break;
            case 2:
                    int temp;
                    while((temp = rand.readInt())!=1){
                    System.out.println(temp);

                     }    
                    break;
            case 3:
                rand.seek(4);
                rand.writeInt(45);
                
                
                break;
                
            case 4:
                int tem=79;
                RandomAccessFile tempo = new RandomAccessFile("D:\\BAKHTIYAR\\JavaFilingPractice\\bharwa.ser", "rw");
                try{
                
                tempo.seek(0);
                rand.seek(0);
                while((tem = rand.readInt())!=45){
                tempo.writeInt(tem);
                
                }
                }catch(Exception e){
                tempo.close();
                rand.close();
                File r = new File("D:\\BAKHTIYAR\\JavaFilingPractice\\bharwa.ser");
                File q = new File("D:\\BAKHTIYAR\\JavaFilingPractice\\harami.ser");
                q.delete();
                r.renameTo(new File("D:\\BAKHTIYAR\\JavaFilingPractice\\harami.ser"));
                
                
                
                
                }
                
                
                break;
            case 5:
                break;
            
       }
       }catch(Exception ex){
       System.out.println("file end");
       }
       
       
       
       
    }
    
}

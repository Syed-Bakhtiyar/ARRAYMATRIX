/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise17_8;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author bakhtiyar
 */
public class Exercise17_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int choise,count;
        Scanner input = new Scanner(System.in);
            try(RandomAccessFile rand = new RandomAccessFile("D:\\BAKHTIYAR\\JavaFilingPractice\\Count2.DAT", "rw")){
              if(rand.length()==0){
                  rand.seek(0);
                  count=1;
                  rand.writeInt(count);
                  System.out.println("Count is "+count);
              }else{
                int var;
                    while((var=rand.readInt())!=-1){
                        var++;
                        rand.seek(0);
                        rand.writeInt(var);
                        System.out.println("Count is "+var);
                    }
                }
              rand.close();
            }catch(Exception ex){
                System.out.println("exeption");
            }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectarrayserializablefiling;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author bakhtiyar
 */
public class ObjectArraySerializableFiling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};    
    //String[] str = {"Syed","Muhammad","Bakhtiyar","Ahmed"};
    Scanner input = new Scanner(System.in);
        System.out.println("1.write object\n2.readobject\nyour choice");
        
    int choice = input.nextInt();
    if(choice==1){
    try(ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("D:\\BAKHTIYAR\\JavaFilingPractice\\reco.DAT"))){
    obj.writeObject(arr);
    obj.close();
    }catch(Exception ex){
        
        System.out.println("can't open file");
        
    
    }
    }else if(choice == 2){
        try(ObjectInputStream inp = new ObjectInputStream(new FileInputStream("D:\\BAKHTIYAR\\JavaFilingPractice\\reco.DAT"))){
        int[] temp = (int[])(inp.readObject());
        //String[] temp2 = (String[])(inp.readObject());
        for(int i=0;i<temp.length;i++){
        System.out.print(temp[i]+" ");
        }
        System.out.println("");
//        for(int i=0;i<temp2.length;i++){
//        System.out.print(temp2[i]+" ");
//        }
        
       inp.close();
        
        }catch(Exception a){
        System.out.println("read end");
       
        }
    
    }
    
    
    
    
    
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avrreturn;
import java.util.Scanner;
/**
 *
 * @author bakhtiyar
 */
public class AvrReturn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // System.out.printf("%d\n",(args.length));
        Scanner input = new Scanner(System.in);
        int[] array={10,2,11,5,6,10};
       
        int limit;
        
        
        final int a=array.length;
        int i;
        System.out.println("LIST BEFORE USER ENTRY IS\n");
        for(i=0;i<array.length;i++){
            System.out.printf("%d\n",array[i]);
        }
        System.out.println("ENTER NUMBERS TO FIND AVERAGE\n");
        
        for(i=0;i<array.length;i++){
            array[i] = input.nextInt();
            
        }
        ret(array,a);
        System.out.println("enter limit to find average:");
        limit = input.nextInt();
        int[] barray = new int[limit];
        System.out.println("ENTER SECOND ARRAY INPUT\n");
        for(i=0;i<barray.length;i++){
        barray[i]=input.nextInt();
        }
        
        ret(barray,limit);
        
    }
    static void ret(int[] b,int x){
        int temp=0;
        for(int i=0; i<x;i++){
        temp+=b[i];
        }
        System.out.printf("\n**average is: %d**",(temp/x));
        
    }
    
}

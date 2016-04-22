/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrrrett;
import java.util.Scanner;
/**
 *
 * @author bakhtiyar
 */
public class Arrrrett {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] array =new int[10];
       int i;
       Scanner input = new Scanner(System.in);
       for(i=0;i<10;i++){
       array[i]= input.nextInt();
       }
     //System.out.println("output\n");
      // for(i=0;i<10;i++){
      // System.out.printf("\n%d\n",array[i]);
      // }
     
       System.out.println("\nopposite\n");
       
       for(i=9;i>-1;i--){
           System.out.printf("%d\n",array[i]);
       }
    }
    
    
}

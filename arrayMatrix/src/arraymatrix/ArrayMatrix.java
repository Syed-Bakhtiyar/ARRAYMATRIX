/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraymatrix;
import java.util.Scanner;
/**
 *
 * @author bakhtiyar
 */
public class ArrayMatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = new int[4];
        int[] array2 = new int[4];
        int[] ans = new int[4]; 
        int i, count=1;
        Scanner input = new Scanner(System.in);
        for(i=0;i<4;i++){
            System.out.printf("\n ENTER %d input for array1: ",count);
            array[i] = input.nextInt();
            count++;
        }
        count=1;
        for(i=0;i<4;i++){
            System.out.printf("\n ENTER %d input for array2:  ",count);
            array2[i] = input.nextInt();
        }
        for(i=0;i<4;i++){
            ans[i] = array[i]+array2[i]; 
        }
        count =1;
        for(i=0;i<4;i++){
        System.out.printf("\n(%d )answer of index # %d is:  %d\n\n",count,count,ans[i]);
        count++;
        }
        
    }
    
}

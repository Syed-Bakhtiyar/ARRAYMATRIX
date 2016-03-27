/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;
import java.util.Scanner;
/**
 *
 * @author bakhtiyar
 */
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            int[] array = new int[10];
            int i=0,j;
            Scanner input = new Scanner(System.in);
            System.out.println("\n ENTER 10 NUMBER: \n");
            do{
                array[i]= input.nextInt();
                i++;
            } while(i<10);
            System.out.println("\n OUTPUT WITHOUT SORTING IS BELOW: \n");
            i=0;
            while(i<10){
                System.out.printf("%d\n",array[i]);
                i++;
            }
            for(i=0;i<10;i++){
                for(j=i+1;j<10;j++){
                    if(array[i]>array[j]){
                     int temp;
                     temp = array[i];
                     array[i]= array[j];
                     array[j]=temp;
                    }
                }
            }
            int count =1;
            System.out.println("\n OUTPUT AFTER LOWER TO UPPER SORTING IS BELOW: \n");
            for(i=0;i<10;i++){
                System.out.printf("(%d) %d\n",count,array[i]);
                count++;
            }
    }
    
}

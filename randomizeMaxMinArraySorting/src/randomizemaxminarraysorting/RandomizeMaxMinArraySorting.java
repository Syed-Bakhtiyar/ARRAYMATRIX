/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomizemaxminarraysorting;
import java.util.Scanner;
import java.security.SecureRandom;
/**
 *
 * @author bakhtiyar
 */
public class RandomizeMaxMinArraySorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom randomNumber = new SecureRandom();
        int[] array = new int[10];
        int x,i=0;
        while(i<10){
            array[i] =  randomNumber.nextInt(100);
            i++;
        }
        int count =1;
        for(i=0;i<array.length;i++){
        System.out.printf("%d)Random NUMBER IS: %d\n",count,array[i]);
        count++;
        }
do{
    System.out.print("\t1.MAX AND MINIMUM OF LIST\n\t2.SORTING LIST\n\t3.exit\n");
    x= input.nextInt();
    switch(x){
            case 1:
                int max,min;
                max = array[0];
                for(i=0;i<array.length;i++){
                if(array[i]>max){
                    max = array[i];
                    }
                }
                System.out.printf("MAXIMUM VALUE IS: %d",max);
                min = max;
                for(i=0;i<array.length;i++){
                    if(min>array[i]){
                    min = array[i];
                    }
                }
                System.out.printf("\nMINIMUM VALUE IS: %d%n",min);
                break;
            case 2:
                int y;
                int j; 
                System.out.println("\t1.ascending sorting\n\t2.decending sorting");
                y=input.nextInt();
            if(y==1){

                for(i=0;i<10;i++){
                    for(j=i+1;j<10;j++){
                        if(array[i]>array[j]){
                            int temp = array[i];
                            array[i]=array[j];
                            array[j]=temp;
                        }
                    }
                }
                for(i=0;i<array.length;i++){
                    System.out.printf("%d\n",array[i]);

                }
            }else
            if(y==2){
                for(i=0;i<array.length;i++){
                    for(j=i+1;j<array.length;j++){
                        if(array[i]<array[j]){
                        int temp = array[i];
                        array[i]=array[j];
                        array[j]=temp;
                        }
                    }
                }
                i=0;
                System.out.println();
                do{
                System.out.printf("%d\n",array[i]);
                i++;
                }while(i<array.length);
            }
                break;
            case 3:
                System.exit(0);
                break;
    }
} while(true);
        }
    }

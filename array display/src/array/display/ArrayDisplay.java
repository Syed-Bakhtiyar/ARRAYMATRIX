
package array.display;
import java.util.Scanner;
/**
 *
 * @author bakhtiyar
 */
public class ArrayDisplay {
    public static void main(String[] args) {
            int[] array = new int[10];
            int i,max,min;  
                Scanner input = new Scanner (System.in);
            for(i=0;i<10;i++){
                array[i] = input.nextInt();
            }
            max=array[0];
            for(i=0;i<10;i++){
                if(array[i]>max){
                    max=array[i];
               }
            }
            System.out.printf("\nmaximum value is: %d",max);
            min=max;
            for(i=0;i<10;i++){
                if(array[i]<min){
                min = array[i];
               }
            }
            System.out.printf("\nminimum value is: %d",min);
    }
 }

package binarysearch01;
import java.security.SecureRandom;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author bakhtiyar
 */
public class BinarySearch01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            int[] data = new int[100];
            int count =0;
            int i,search;
            int left=1;
            int right=data.length-1;
            int middle = ((right+left)/2)-1;
            SecureRandom random = new SecureRandom();
            Scanner input = new Scanner(System.in);
            for(i=0;i<data.length;i++){
                data[i] = random.nextInt(100);
            }
         Arrays.sort(data);
            for (i = 0; i < data.length; i++) {
                System.out.println(data[i]);
            }
          System.out.print("Enter a number to search in data: ");
          search = input.nextInt();
          do{
          if(search == data[middle]){
          System.out.println("Data is in "+middle+"index");
          System.out.println("iteration is: "+count);
          input.next();
          System.exit(0);
          }
          else if(search>data[middle]){
              left = middle +1;
              middle = ((left+right)/2);
          }
          else if(search<data[middle]){
              right = middle -1;
              middle = ((left+right)/2);
          }
          count++;
          }while(true);
    }
    
}

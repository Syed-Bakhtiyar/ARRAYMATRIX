/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysfunctionsinutil;
import java.security.SecureRandom;
import java.util.Arrays;
/**
 *
 * @author bakhtiyar
 */
public class ArraysFunctionsInUtil {

    
    public static void main(String[] args) {
        int[] arr = new int[20];
        int i=0;
        SecureRandom a = new SecureRandom();
        for(;i<arr.length;i++){
            arr[i]= a.nextInt(500);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, 34));
        
      
        
    }
    
}

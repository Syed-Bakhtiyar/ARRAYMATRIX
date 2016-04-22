
package farrukharra;
import java.security.SecureRandom;
/**
 *
 * @author bakhtiyar
 */
public class Farrukharra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SecureRandom abc = new SecureRandom();
        
        int[] arr = new int[10];
        int i;
        for(i=0;i<arr.length;i++){
        arr[i] = abc.nextInt(100);
        }
        int a = aver(arr);
        System.out.println("average is: "+a);
//        char[] barr = new char[10];
//        double[] darr = new double[10];
//        float[] farr = new float[10];
    }
    public static int aver(int[] nulla){
    int temp=0;
    for(int i=0 ;i<nulla.length;i++){
    temp+=nulla[i];
    }
    return (temp/nulla.length);
    }
    
}

package firstbinarysearch;
import java.util.Arrays;
import java.util.Scanner;
import java.security.SecureRandom;
/**
 *
 * @author bakhtiyar
 */
public class FirstBinarySearch {

    public static int binarySearch(int[] data,int key){
    int low =0;
    int high = data.length-1;
    int middle = (low+high+1)/2;
    int loc = -1;
    do{
    System.out.println(remaining(data,low,high));
    for(int i=0;i<middle;i++){
    System.out.println("  ");
    }    
    System.out.println(" * ");
    if(key==data[middle]){
    loc = middle;
    }else if(key<data[middle]){
    high = middle-1;
    }else{
    low = middle+1;
    }
    middle = (low+high+1)/2;
    }while((low<=high)&&(loc == -1));
    return loc;
    }
    public static String remaining(int[] data,int low,int high){
    StringBuilder temp = new StringBuilder();
    for(int i=0;i<low;i++){
        temp.append("  ");
    }
    for(int i=low;i<=high;i++){
        temp.append(data[i]+" ");
    }
    return String.format("%s\n", temp);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom gen = new SecureRandom();
        int[] data = new int[15];
        for(int i =0;i<data.length;i++){
            data[i] = 10+ gen.nextInt(90);
        }
        Arrays.sort(data);
        System.out.println(Arrays.toString(data));
        System.out.println("please enter an integer value (-1 to quit)");
        int search = input.nextInt();
        while(search != -1){
        int loc = binarySearch(data, search);
        if (loc == -1)
            System.out.println(search+" was not found");
        else 
                System.out.println(search+" is found in position "+ loc);
                System.out.println("please enter an integer value (-1 to quit): ");
                search = input.nextInt();
        
        
        }
    }
    
}

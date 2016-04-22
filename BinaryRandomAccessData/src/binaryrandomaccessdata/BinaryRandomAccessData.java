package binaryrandomaccessdata;
import java.io.*;
import java.util.Scanner;





public class BinaryRandomAccessData {
    public static RandomAccessFile randfile;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] data = new int[10];
        int choice,i;
        Scanner input = new Scanner(System.in);
        try {
            randfile = new RandomAccessFile("D:\\BAKHTIYAR\\JavaFilingPractice\\Rand.DAT", "rw");
        } catch (FileNotFoundException ex) {
                System.out.println("file not found");
        }
        System.out.println("1.write\n2.read");
        try{
        choice = input.nextInt();
        
        if(choice==1){
              System.out.println("Enter a data number");
              for(i=0;i<data.length;i++){
                data[i]= input.nextInt();
                
              }
                for(i=0;i<data.length;i++){
                    try {
                        randfile.writeInt(data[i]);
                        
                    } catch (IOException ex) {
                        System.out.println("cant write");
                    }
                }
        }
        else if(choice ==2){
            try {
                randfile.seek(0);       //set the pointer to 0 position
                for(i=0;i<data.length;i++){
                    try {
                        data[i] = randfile.readInt();
                        System.out.println(data[i]);
                        
                    } catch (EOFException ex) {
                        System.out.println("read complete");
                    }
                    
                }
               System.out.println("length of file is: "+randfile.length());
            } catch (IOException ex) {
                System.out.println("cant open for read");
            }
        }
        }catch(Exception ex){
        System.out.println("input missmatch");
        }
        
    }
}

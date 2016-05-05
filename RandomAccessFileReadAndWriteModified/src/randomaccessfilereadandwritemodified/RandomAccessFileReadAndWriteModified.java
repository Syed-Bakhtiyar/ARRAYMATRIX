package randomaccessfilereadandwritemodified;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author bakhtiyar
 */
public class RandomAccessFileReadAndWriteModified {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice,data,modi;
        int var;
        int size = Integer.SIZE;
        do{
    try( RandomAccessFile rand = new RandomAccessFile("D:\\BAKHTIYAR\\JavaFilingPractice\\record3.dat", "rw")){
          //   rand.setLength(0);
            rand.seek(0);
            rand.writeInt(0000);
            System.out.println("1.write\n2.read\n3.modified\n4.delete\n5.exit ");
            System.out.print("\nEnter your choice: ");
            //System.out.println("Length of current file is: "+rand.length());
            choice = input.nextInt();
            switch (choice){
                case 1:
                  long setpos= rand.length();
                  rand.seek(setpos);
                  System.out.print("Enter a Number: ");
                  data = input.nextInt();
                  rand.writeInt(data);
                    break;
                    
                case 2:
                    rand.seek(4);
                    
                    try{
                    while((var = rand.readInt())!=-1){
                        System.out.println(var);
                    }
                    }catch(Exception ex){
                        System.out.println("read completed");
                    }
                    break;
                    
                    
                case 3:
                    rand.seek(0);
                    System.out.print("Enter Which Number To modify? ");
                    modi = input.nextInt();
                    while((var = rand.readInt())!=-1){
                        if(modi == var){
                        System.out.println("File pointer is now "+ rand.getFilePointer());
                        
                       
                        
                            
                      
                        rand.seek((rand.getFilePointer()-8));
                     
                        System.out.println("current position is: "+ rand.readInt());
                        System.out.print("Enter new data to modify: ");
                        modi = input.nextInt();
                        rand.writeInt(modi);
                        break;
                        }
                                        
                    }
                    
                    
                    break;
                    
                    
                case 4:
                    System.out.print("Enter a data (number) to delete: ");
                    int temp = input.nextInt();
            RandomAccessFile tempo = new RandomAccessFile("D:\\BAKHTIYAR\\JavaFilingPractice\\temp.dat", "rw");
                    rand.seek(0);
                    tempo.seek(0);
                    try{
                        while((var=rand.readInt())!=-1){
                        if(var!=temp){
                        tempo.writeInt(var);
                        }
                    }
                    }
                    catch(Exception ex){
                    tempo.close();
                    rand.close();
                    File f = new File("D:\\BAKHTIYAR\\JavaFilingPractice\\record3.dat");
                    if(f.exists())
                    f.delete();
                    File t = new File("D:\\BAKHTIYAR\\JavaFilingPractice\\temp.dat");
                    if(t.exists())
                    t.renameTo(new File("D:\\BAKHTIYAR\\JavaFilingPractice\\record3.dat"));
                    }
                    
                    break;
                    
                case 5:
                    rand.close();
                    System.exit(0);
                    break;
            
            
            
            
            }
            }catch(Exception ex){
            
                System.out.println("file not found ");
            }
        
        
        
        
        }while(true);
        
    }
    
}

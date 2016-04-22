/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package file;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Filling {
      public Filling(){
          
      }
     // Determine a home directory
//    public static void main(String[] args) {
//        System.out.println(System.getProperty("user.home"));
      public static void main(String[] args) {
       // Verifying a file/directory exists
//        File f = new File("D:\\test\\tf.txt"); 
//        if (f.exists()) {
//            System.out.println(f.getName() + " File exists ");
//        } else {
//            System.out.println("File does not exist");
//        } 
    
   // Deleting a File
//        File f = new File("D:\\test\\tf.txt");
//        if (f.exists()) {
//            f.delete();
//            System.out.println("File  has deleted");
//        }
        String fname;
        File f = new File("D:\\test\\tf.txt");
        if (f.exists()) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter file name");
            fname = input.nextLine();
            f.renameTo(new File("D:\\test\\"+fname+".txt"));
            System.out.println("File has renamed");
        } else {
            System.out.println("File does not exists");
        }
//        File file = new File("D://abcd.txt");
//        boolean fileCreated = false;
//        try {
//            fileCreated = file.createNewFile();
//        } catch (IOException ioe) {
//            System.out.println("Error while creating empty file: " + ioe);
//        }
// 
//        if (fileCreated) {
//            System.out.println("Created empty file: " + file.getPath());
//        } else {
//            System.out.println("Failed to create empty file: " + file.getPath());
//        }
       boolean dirFlag = false;

 //create File object
//File stockDir = new File("D:\\stockDir ");
//
//try {
//   dirFlag = stockDir.mkdir();
//} catch (SecurityException Se) {
//System.out.println("Error while creating directory in Java:" + Se);
//}
//
//if (dirFlag)
//   System.out.println("Directory created successfully");
//else
//   System.out.println("Directory was not created successfully");


   }


}
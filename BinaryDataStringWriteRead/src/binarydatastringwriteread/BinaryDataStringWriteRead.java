/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarydatastringwriteread;
import java.util.Scanner;
import java.io.*;


/**
 *
 * @author bakhtiyar
 */
public class BinaryDataStringWriteRead {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner input = new Scanner(System.in);
        String sent;
        int count;
        System.out.println("1.write\n2.read");
        count = input.nextInt();
        if(count ==1){
            Scanner abc = new Scanner(System.in);
            System.out.println("Enter Sentence");
            sent = abc.nextLine();
            try {
                DataOutputStream out = new DataOutputStream(new FileOutputStream("D:\\BAKHTIYAR\\JavaFilingPractice\\Stringg.cpp"));
                try {
                    out.writeUTF(sent);
                } catch (IOException ex) {
                    System.out.println("Can't write to file");
                }
            } catch (FileNotFoundException ex) {
                System.out.println("File Can't Create");
            }
        }else if(count ==2){
        DataInputStream in = new DataInputStream(new FileInputStream("D:\\BAKHTIYAR\\JavaFilingPractice\\Stringg.cpp"));
        try{
        String sen = in.readUTF();
        System.out.println(sen);
        }catch(EOFException a){
            System.out.println("can't read");
        }
        }
    }
    
}

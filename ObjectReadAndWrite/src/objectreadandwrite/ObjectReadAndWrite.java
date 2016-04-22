/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectreadandwrite;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author bakhtiyar
 */
public class ObjectReadAndWrite {

    private static ObjectOutputStream objectOutputStream;
    public int age;
    public String name;
    public float salary;
   
    public static void main(String[] args) {
        ObjectReadAndWrite[] obj = new ObjectReadAndWrite[2];
        for(int i=0;i<obj.length;i++){
        obj[i]= new ObjectReadAndWrite();
        }
        Scanner input =  new Scanner(System.in);
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("D:\\BAKHTIYAR\\JavaFilingPractice\\recordd.dat"));
        } catch (IOException ex) {
            System.out.print("cant created");
        }
        System.out.println("enter name: ");
        obj[0].name = input.nextLine();
        System.out.println("enter age: ");
        obj[0].age = input.nextInt();
        System.out.println("Enter Salary: ");
        obj[0].salary = input.nextFloat();
        try {
            objectOutputStream.writeObject(obj[0]);
        } catch (IOException ex) {
            System.out.println("Can't write to a file");
        }
    }
    
}

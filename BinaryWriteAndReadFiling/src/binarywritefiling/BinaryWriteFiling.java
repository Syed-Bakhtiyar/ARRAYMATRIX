/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarywritefiling;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
/**
 *
 * @author bakhtiyar
 */
public class BinaryWriteFiling {
    private int age;
    private String name;
    private float salary;
    
    public BinaryWriteFiling() {
        this.age = 0;
        this.name = "";
        this.salary = 5000.12f;
    }
    public void setNAS(int age,String name,float salary){
        this.age =age;
        this.name = name;
        this.salary = salary;
    }
    public String getNAS(){
        return String.format("%s %d %.2f",name,age,salary );
    }
    public static ObjectOutputStream file;
    public static ObjectInputStream readfile;
    public static BinaryWriteFiling obj;
    
    
    
    
    public static void main(String[] args) {
        
        int age;
        float salary;
        int choice;
        obj = new BinaryWriteFiling();
        Scanner input = new Scanner(System.in);
        
        choice = input.nextInt();
        if(choice ==1){
        try{
            file = new ObjectOutputStream(Files.newOutputStream(Paths.get("D:\\client.DAT")));
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "can't open file");
            System.exit(1);
        }
        System.out.println(obj.getNAS());
        try{
            System.out.print("Enter Name: ");
            String name;
            name = input.nextLine();
            System.out.print("Enter age");
            age = input.nextInt();
            System.out.print("Enter salary: ");
            salary = input.nextFloat();
            obj.setNAS(age, name, salary);
            file.writeObject(obj);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "input missmatch exeption");
        }
        }else if(choice == 2){
        try{
            readfile = new ObjectInputStream(Files.newInputStream(Paths.get("D:\\client.DAT")));
            readfile.readObject();
            System.out.println();
        
        }catch(Exception ex){
            System.out.println("cant't read object");
        }
        }
    }
    
}

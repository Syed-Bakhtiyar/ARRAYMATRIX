/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackwiththehelpoflinkedlist;
import java.util.Scanner;
/**
 *
 * @author bakhtiyar
 */
public class StackWithTheHelpOfLinkedList {
    public int data;
    public StackWithTheHelpOfLinkedList next;
    
    
    public static void main(String[] args) {
        int data,choice;
        
        StackWithTheHelpOfLinkedList obj = new StackWithTheHelpOfLinkedList();
        obj.next = null;
        StackWithTheHelpOfLinkedList temp = new StackWithTheHelpOfLinkedList();
        
        do{
            System.out.println("1.create new mode\n2.add data\n3.delete\n4.exit\nenter your choice");
            Scanner input = new Scanner(System.in);
            choice = input.nextInt();
            if(choice==1){
                temp.next = null;
                obj = temp;
                System.out.println("created");
                
            }
            if(choice ==2){
                System.out.print("Enter a Number: ");
                temp = new StackWithTheHelpOfLinkedList();
                data=input.nextInt();
                temp.data=data;
                temp.next = obj;
                obj = temp;
            }
            if(choice==3){
                while(obj.next!=null){
                System.out.println(obj.data);
                obj = obj.next;
                 }
            }
            if(choice==4){
            System.exit(0);
            }
        }while(true);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceclas;
import java.util.Scanner;
import java.lang.*;
import jdk.nashorn.internal.runtime.Undefined;
//import java.io.BufferedWriter;
/**
 *
 * @author bakhtiyar
 */
public class INHERITANCEcLAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        INHERITFROM[] A= new INHERITFROM[10];
       
        for(int i=0;i<A.length;i++){
        A[i]=   new INHERITFROM();
        }
        
        
        
        
        int age;
        int count =1;
        double salary;
        int i=0;
        int choice=1;
         String name= "";
        char position;
        do{ /////////      master commit
            if(choice==0){
                System.exit(0);
            }else{
            Scanner input = new Scanner(System.in);
            System.out.print("\nENTER NAME: ");
  
            name = input.nextLine();

            System.out.print("\nENTER AGE: ");

            age = input.nextInt();

            System.out.print("\nENTER SALARY: ");

            salary = input.nextDouble();
            
           // A[i] = new INHERITFROM();
            
            A[i].setNAS(name, age, salary);

            String name2 = A[i].getname();
            
            int age2=A[i].getage();
            
            double salary2 = A[i].getsalary();
            System.out.print("\nNAME IS: ");
            System.out.println(name2);
            System.out.print("\nAGE OF PERSON IS: ");
            System.out.println(age2);
            System.out.print("\nSALARY OF PERSON IS: ");
            System.out.println(salary2);
            System.out.print("\nENTER GRADE IF REQUIRED PRESS 1 and 0 for no required: ");
            int x = input.nextInt();
            System.out.println();
            if(x==1){
                System.out.print("ENTER GRADE: ");
                String as=input.next();
                position = as.charAt(0);
                A[i].setposition(position);
                System.out.printf("(%d) grade of %s is: '%c'\n",count,name,position);
                count++;
            }


            i++;
            System.out.print("\n\n if you wan't to exit press 0 and enter: ");
            choice=input.nextInt();
            }
        }while(i<A.length);
        System.out.println("ENTERY IS FULL: ");
    }
    
}

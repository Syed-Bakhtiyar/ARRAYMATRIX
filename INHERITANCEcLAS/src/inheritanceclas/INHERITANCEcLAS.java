/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceclas;
import java.util.Scanner;
/**
 *
 * @author bakhtiyar
 */
public class INHERITANCEcLAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        INHERITFROM[] A= new INHERITFROM[10];
       
        for(int i=0;i<A.length;i++){
        A[i]=   new INHERITFROM();
        }
        
        
        
        String name;
        int age;
        int count =1;
        double salary;
        int i=0;
        char position;
        do{            
            System.out.print("ENTER NAME: ");
            name = input.nextLine();

            System.out.print("ENTER AGE: ");
            age = input.nextInt();

            System.out.print("ENTER SALARY: ");
            salary = input.nextDouble();
            
           // A[i] = new INHERITFROM();
            
            A[i].setNAS(name, age, salary);

            String name2 = A[i].getname();
            
            int age2=A[i].getage();
            
            double salary2 = A[i].getsalary();
            System.out.print("NAME IS: ");
            System.out.println(name2);
            System.out.print("AGE OF PERSON IS: ");
            System.out.println(age2);
            System.out.print("SALARY OF PERSON IS: ");
            System.out.println(salary2);
            System.out.print("ENTER GRADE IF REQUIRED PRESS 1");
            int x = input.nextInt();
            if(x==1){
                System.out.print("ENTER GRADE: ");
                String as=input.next();
                position = as.charAt(0);
                A[i].setposition(position);
                System.out.printf("(%d) grade of %s is: '%c'",count,name,position);
                count++;
            }


            i++;
        }while(i<10);
        System.out.println("ENTERY IS FULL: ");
    }
    
}

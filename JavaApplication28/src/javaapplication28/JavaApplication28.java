/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication28;
import java.util.Scanner;
/**
 *
 * @author bakhtiyar
 */
public class JavaApplication28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String name;
        int age;
        float salary;
        NewClass28 a = new NewClass28();
        System.out.print("ENTER NAME: ");
        name = input.nextLine();
        System.out.print("ENTER AGE: ");
        age = input.nextInt();
        System.out.print("ENTER BASIC SALARY: ");
        salary = input.nextFloat();
        a.setNas(name, age, salary);
        System.out.printf("NAME IS: %s",a.getname());
        System.out.printf("AGE IS: %d",a.getage());
        System.out.printf("salary is: %f",a.getsalary());
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism.inherit;
import java.util.Scanner;
import java.lang.*;

/**
 *
 * @author bakhtiyar
 */
public class PolymorphismInherit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name;
        int age;
        float marks;
        String fathername;
        String education;
        String phonenumber;
        String experience;
        
        child[] b = new child[10];
        
        int i=0;
        while(i<10){
        b[i] = new child();
        i++;
        }
        parent a = new parent("BAKHTIYAR","BSCS","0346 2597420","syed rafique ahmed",21,557);
        System.out.println("parent constructor invoked");
        System.out.printf("%s\n",a.getname());
        System.out.printf("%s\n",a.getedu());
        System.out.printf("%s\n",a.getPhn());
        System.out.printf("%s\n",a.getFathername());
        System.out.printf("%d",a.getage());
        System.out.printf("%.2f",a.getMarks());
        System.out.println();
        i=0;
        int x;
        Scanner input = new Scanner(System.in);
        System.out.print("1. student record\n2.teacher record\n");
        x=input.nextInt();
        if(x==1){
            do{
                Scanner in = new Scanner(System.in);
                name = "";
                System.out.print("ENTER NAME: ");
                name=in.nextLine();
                System.out.print("ENTER FATHERNAME: ");
                fathername= in.nextLine();
                System.out.print("ENTER EDUCATION: ");
                education=in.nextLine();
                System.out.print("ENTER CELL NUMBER: ");
                phonenumber=in.nextLine();
                System.out.print("ENTER AGE: ");
                age = in.nextInt();
                System.out.print("ENTER PREVIOUS MARKS: ");
                marks=in.nextFloat();
                b[i].SetDetail(name, education, phonenumber, fathername, age, marks);
                System.out.printf("\n\t++INFORMATION IS++ \nname is: %s\nFATHER NAME IS: %s\nEDUCATION IS: %s\nCELL NO IS: %s\nAGE IS: %d\nMARKS IS %.4f",b[i].getname(),b[i].getFathername(),b[i].getedu(),b[i].getPhn(),b[i].getage(),b[i].getMarks());
                System.out.print("ARE YOU WAN'T TO ADD ANOTHER RECORD: y/n: " );
                char y;
                String ch = input.next();
                y=ch.charAt(0);
                    if(y=='n'){
                        System.exit(0);
                    }
                System.out.println("\n\n");
                i++;
            }while(i<10);
        }
        child[] c = new child[10];
        for(i=0;i<10;i++){
            c[i]=new child();
        }
        i=0;
        if(x==2){
            do{
                name = "";
                Scanner in = new Scanner(System.in);
                System.out.print("ENTER NAME: ");
                name = in.nextLine();
                System.out.print("ENTER EDUCATION: ");
                education = in.nextLine();
                System.out.print("ENTER EXPERINCE IN YEAR OR MONTH: ");
                experience = in.nextLine();
                System.out.print("ENTER AGE: ");
                age=in.nextInt();
                c[i].setData(name, education, age, experience);
                System.out.println("\n");
                System.out.printf("NAME IS: %s\nEDUCATION IS: %s\nEXPERIENCE IS: %s\nAGE IS: %s",c[i].getTname(),c[i].getTeducation(),c[i].getTexp(),c[i].getTage());
                System.out.println("\nARE YOU WAN'T TO ADD ANOTHER RECORD? y/n");
                char y;
                String ch = in.next();
                y=ch.charAt(0);
                if(y=='n'){
                System.exit(0);
                }
                i++;    
            }while(i<10);
        }
    } 
}

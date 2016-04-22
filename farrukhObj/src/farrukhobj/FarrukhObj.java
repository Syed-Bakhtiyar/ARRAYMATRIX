/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farrukhobj;
import java.util.Scanner;
/**
 *
 * @author bakhtiyar
 */
public class FarrukhObj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x,y;
       Scanner b = new Scanner(System.in);
       student1 a = new student1(1,2);
       
       
       
       
       
       student1[] arr = new student1[10];
      // arr[0] = new student1 (1,2);
      for(int i=0;i<arr.length;i++){
      arr[i] = new student1();
      }
       
       
       
       System.out.println("object array");
       
       
       
       System.out.println(arr[0].getAdd());
       
       x=b.nextInt();
       y=b.nextInt();
       a.setNum(x, y);
       System.out.println(a.getAdd());
       a.hello();
      }
    
}

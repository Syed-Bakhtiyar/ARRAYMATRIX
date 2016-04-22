/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farrrukfunct;
import java.util.Scanner;
/**
 *
 * @author bakhtiyar
 */
public class Farrrukfunct {
        public static int add(int a, int b){
        
        return a+b;
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int a, b;
      System.out.print("enter 1st no");
      Scanner abc= new Scanner(System.in);
      a=abc.nextInt();
      System.out.print("enter 2nd no");
      b=abc.nextInt();
      System.out.println(add(a,b));
// TODO code application logic here
    }
    
}

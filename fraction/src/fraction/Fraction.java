/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fraction;
import java.util.*;
/**
 *
 * @author bakhtiyar
 */
public class Fraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int x;
      System.out.print("ENTER FACTORIAL LIKE THIS '!' and press enter and then NUMBER:\n ");
      char c;
      String s = input.next();
      c=s.charAt(0);
      x = input.nextInt();
      if(c=='!'){
      for(int i=x-1;i>0;i--){
          x= x*i;
      }     
      System.out.printf("FACTORIAL IS %d\n",x);      
      
    }
    }
}

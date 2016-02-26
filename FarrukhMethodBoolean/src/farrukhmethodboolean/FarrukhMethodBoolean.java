/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farrukhmethodboolean;
import java.util.Scanner;
/**
 *
 * @author bakhtiyar
 */
public class FarrukhMethodBoolean {
    public static boolean and(boolean x , boolean y){
    return (x&&y);
    }
    
    
    public static void main(String[] args) {
        Scanner abc= new Scanner (System.in);
        boolean a,b;
       a=abc.nextBoolean();
       b=abc.nextBoolean();
       System.out.println("1.and , 2.or , 3.xor");
       int c=0;
       c=abc.nextInt();
       if(c==1){
       System.out.println(FarrukhMethodBoolean.and(a,b));
       }
       else if(c==2){
       System.out.println(or(a,b));
       }
       else if(c==3){
       System.out.println(xor(a,b));
       }
         
    }
    public static boolean or(boolean x , boolean y){
    return (x||y);
    }
    public static boolean xor(boolean x , boolean y){
    return(x^y);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.ulat;
import java.util.*;
/**
 *
 * @author bakhtiyar
 */
public class StringUlat {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int i=0;
   // String a = input.next();
    char[] st = new char[80];
    String name;
    System.out.println("ENTER A SENTENCE \n");
    name = input.nextLine();
    System.out.printf("NAME IS \n%s\n",name);
    int len = name.length();
    len--;
    System.out.println("\nconvert");
    for(i=len;i>=0;i--){
         System.out.printf("%c",name.charAt(i));
    }
    System.out.println("\n");
    }
}

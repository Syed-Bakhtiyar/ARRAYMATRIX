/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farrukharraystring;
import java.util.Scanner;
/**
 *
 * @author bakhtiyar
 */
public class FarrukhArrayString {

    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String[] a= new String[10];
    int i;
    for(i=0;i<a.length;i++){
    a[i]=input.nextLine();
    }
    for(i=0;i<a.length;i++){
    System.out.println(a[i]);
    
    }
    
    }
    
}

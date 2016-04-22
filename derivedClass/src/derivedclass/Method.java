/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package derivedclass;
import java.util.Scanner;
/**
 *
 * @author bakhtiyar
 */
public class Method {
     private String name;
    public void inp(){
        Scanner input = new Scanner (System.in) ; 
        name = input.nextLine(); 
    }
    public void output(){
        System.out.printf("%s\n",name);
    }
}

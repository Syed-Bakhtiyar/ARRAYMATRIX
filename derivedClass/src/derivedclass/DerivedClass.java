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
public class DerivedClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name1;
        Scanner input = new Scanner(System.in);
       // name1 = input.nextLine();
        Method m = new Method();
        m.inp();
        System.out.println("\nhey buddy\n");
        m.output();
    }
    
}

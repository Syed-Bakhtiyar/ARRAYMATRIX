/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceconstroctorfirsttolast;

/**
 *
 * @author bakhtiyar
 */
public class InheritanceConstroctorFirstToLast extends Father {

    public InheritanceConstroctorFirstToLast() {
    
    System.out.println("child constructor");
    }
    
    
    public static void main(String[] args) {
        InheritanceConstroctorFirstToLast x = new InheritanceConstroctorFirstToLast();
        
    }
    
}

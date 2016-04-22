/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstabstractclass;

/**
 *
 * @author bakhtiyar
 */
public class FirstAbstractClass extends FatherClass {
    void show(){
            System.out.println("abstract method");
    }
    
    public static void main(String[] args) {
        FirstAbstractClass a = new FirstAbstractClass();
        a.show();
        a.funct();
    }

    
}

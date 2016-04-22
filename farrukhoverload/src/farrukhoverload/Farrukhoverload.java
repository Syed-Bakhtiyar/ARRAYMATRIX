/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farrukhoverload;

/**
 *
 * @author bakhtiyar
 */
public class Farrukhoverload {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       overloaad a = new overloaad();
       a.hello();
       a.hello(2, 2);
       a.hello(2, 3, 4);
    }
    
}

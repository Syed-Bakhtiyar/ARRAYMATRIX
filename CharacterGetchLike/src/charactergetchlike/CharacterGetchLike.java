/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charactergetchlike;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bakhtiyar
 */
public class CharacterGetchLike {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        char ch;
        
            try {
                ch = (char) System.in.read();
            System.out.println("character is "+ch);
            } catch (IOException ex) {
                Logger.getLogger(CharacterGetchLike.class.getName()).log(Level.SEVERE, null, ex);
            }
    
        
    }
    
}

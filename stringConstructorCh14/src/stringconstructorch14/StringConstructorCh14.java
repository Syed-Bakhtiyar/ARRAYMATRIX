/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringconstructorch14;

/**
 *
 * @author bakhtiyar
 */
public class StringConstructorCh14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[] charArray = {'b','i','r','t','h',' ','d','a','y'};
        String s = new String("hello");
        //use String character
        String s1 = new String();
        String s2 = new String(s);
        String s3 = new String(charArray);
        String s4 = new String(charArray,6,3); //ye pehla argument char ka array le raha he
        System.out.printf(                     //dusra kaha se lena he
                                               //teesra kitna lena he
                "s1 = %s%ns2 = %s%ns3 = %s%ns4 = %s%n",s1,s2,s3,s4);
    }
    
}

//AND GATE
//OR GATE
//XOR GATE
// DO BOOLEAN VAIABLE DECLARE KARO
// DONO ME INPUT LO DONO ME USER SE
//PHR IF KI CONDITION LAGAO AUR EK INT VARIABLE LO
//1. AND &&
//2/OR GATE ||
//3.XOR GATE ^
package farrukhlogicalboolean;
import java.util.Scanner;
/**
 *
 * @author bakhtiyar
 */
public class FarrukhLogicalBoolean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a;
       
       
       boolean nulla,tulla;
       Scanner abc= new Scanner(System.in);
       nulla=abc.nextBoolean();
       tulla=abc.nextBoolean();
       
       System.out.println("1. AND &&");
       System.out.println("2. OR ||");
       System.out.println("3. XOR ^");
       
       a=abc.nextInt();
       if(a==1){
       System.out.println("logic of AND gate is: " + (nulla && tulla));
       }else 
       if(a==2){
       System.out.println("logic of OR gate is: " + (nulla||tulla));
       }else
       if(a==3){
       System.out.println("logic of XOR is: " + (nulla^tulla));
       }else
           System.out.println("nulla inzi chutiya programmerss");
       
    }
    
}

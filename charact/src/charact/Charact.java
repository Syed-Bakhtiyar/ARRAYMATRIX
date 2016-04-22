package charact;
import java.util.*;
/**
 *
 * @author bakhtiyar
 */
public class Charact {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char a;
        Scanner input = new Scanner (System.in);
        String astring = input.next();
        a = astring.charAt(0);
        System.out.printf("here is a character: %c",a);
    }
}

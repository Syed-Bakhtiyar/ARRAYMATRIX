//user jo table chahay aur jitnay tk tka chahay print hojay
// is tarah 2*2=4
//


package functioninloop;
import java.util.Scanner;
/**
 *
 * @author bakhtiyar
 */
public class Functioninloop {
  
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("which table do u want!!");
        int a,b;
        a= input.nextInt();
        System.out.println("how much time do u want!!");
        b= input.nextInt();
      
        table(a,b);
         
    }
    
    public static void table(int x, int y){
    for(int i=1 ; i<=y ; i++){
        System.out.println(x    +   "x"   +    i    +    "="     +   (x*i));
    }
    }
}

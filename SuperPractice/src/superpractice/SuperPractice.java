package superpractice;

/**
 *
 * @author bakhtiyar
 */
public class SuperPractice extends SuperHH {
 int salary = 50000;
    public SuperPractice() {
    super();
        System.out.println("sub");
    }
    public void var(){
        super.var();
        System.out.println(super.salary);
        System.out.println(salary);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SuperPractice a = new SuperPractice();
        a.var();
    }
    
}

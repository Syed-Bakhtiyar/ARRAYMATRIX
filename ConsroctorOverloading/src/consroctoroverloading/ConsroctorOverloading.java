package consroctoroverloading;

/**
 *
 * @author bakhtiyar
 */
public class ConsroctorOverloading {
    public ConsroctorOverloading(){
        System.out.println("no argument constructor");
    }
    public ConsroctorOverloading(char a){
    System.out.println("1 argument constructor");
    }
    public ConsroctorOverloading(int b){
    System.out.println("integer arg constr");
    }
    public ConsroctorOverloading(String a,int b){
    System.out.println("double argument constructor");
    }
   
    
    public static void main(String[] args) {
       ConsroctorOverloading a = new ConsroctorOverloading();
       ConsroctorOverloading b = new ConsroctorOverloading('a');
       ConsroctorOverloading c = new ConsroctorOverloading(9);
       ConsroctorOverloading d = new ConsroctorOverloading("name",1);
   }
}

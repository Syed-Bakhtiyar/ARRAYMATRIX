package uniassignment;
public class UniAssignment {
private static int x = 2 ;       //static variable 
    public UniAssignment(){
    System.out.println("Syed");
    }
    public UniAssignment(String name){
    System.out.println(name);
    }
    public void printn(){
    System.out.println(x);
    x++;
    }
    public static void main(String[] args) {
    UniAssignment a = new UniAssignment("bakhtiyar");
    UniAssignment b = new UniAssignment("Ahmed");    
    a.printn();                 
    b.printn();
    a.printn();
    }
}

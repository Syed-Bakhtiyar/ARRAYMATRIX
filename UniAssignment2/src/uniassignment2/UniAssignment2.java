package uniassignment2;
import java.util.Scanner;
public class UniAssignment2 {
    public UniAssignment2(int a){
        System.out.println(a);
    }
    public UniAssignment2(String name){
        System.out.println(name);
    }
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a;
    String name;
    System.out.print("enter name: ");
    name = input.nextLine();
    System.out.print("ENTER NUMBER: ");
    a= input.nextInt();
    UniAssignment2 x = new UniAssignment2(name);
    UniAssignment2 y = new UniAssignment2(a);
    }
}

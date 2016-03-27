/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operatoroverloading;
import java.util.Scanner;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;
/**
 *
 * @author bakhtiyar
 */
public class OperatorOverloading {

    private int a;
    //////////////////////////////////////////////
    public OperatorOverloading() {
    }
    ////////////////////////////////////////////////////////
    public OperatorOverloading(int a) {
        this.a = a;
    }
    ///////////////////////////////////////////////////////
    public int display(){
    return a;
    }
    //////////////////////////////////////////////////////
    public OperatorOverloading add(OperatorOverloading x){
    int temp = a+x.a;
    OperatorOverloading temp1 = new OperatorOverloading(temp);
    return temp1;
    }
    public OperatorOverloading sub(OperatorOverloading x){
    int temp1 = a-x.a;
    OperatorOverloading temp = new OperatorOverloading(temp1);
    return temp;
    
    }
    public void divide(OperatorOverloading x){
        if(x.a == 0){
            System.out.println("Cannot divide by zero");
        }else{
        float temp1 = a/x.a;
        System.out.println("DIVISION IS: "+temp1);
        }
    }
    public OperatorOverloading multi(OperatorOverloading x){
    int temp1 = a*x.a;
    OperatorOverloading temp = new OperatorOverloading(temp1);
    return temp;
    }
    public int assign(OperatorOverloading x){
        a=x.a;
        return a;
    }
    public boolean isequal(OperatorOverloading x){
        if(a==x.a)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean lessthan(OperatorOverloading x){
        if(a<x.a){
            return true;
        }else
        {
            return false;
        }
    }
    public boolean greaterthan(OperatorOverloading x){
        if(a>x.a){
            return true;
        }else
        {
            return false;
        }
    }
    public boolean isnotequal(OperatorOverloading x){
        if(a!=x.a){
            return true;
        }
        else
        {
            return false;
        }

    }
    public boolean greaterEqual(OperatorOverloading x){
        if(a>=x.a){
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean lessEqual(OperatorOverloading x){
        if(a<=x.a){
            return true;
        }
        else
        {
        return false;
        }
    }
    
    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int a,b;
        try{
            System.out.print("ENTER A NUMBER FOR 1ST OBJECT: ");
            a= input.nextInt();
            System.out.print("ENTER A NUMBER FOR SECOND OBJECT: ");
            b= input.nextInt();
            OperatorOverloading ob = new OperatorOverloading(a);
            OperatorOverloading ob2 = new OperatorOverloading(b);
            OperatorOverloading ans = new OperatorOverloading();
            ans = ob.add(ob2);
            System.out.println("addition is: "+ans.display());
            ans = ob.sub(ob2);
            System.out.println("subtraction is: "+ans.display());
            System.out.print("division is: ");
            ob.divide(ob2); 
            ans=ob.multi(ob2);
            System.out.println("multiplication is: "+ans.display());
            System.out.println("object 2 is assign a value in object 1 is: "+ ob.assign(ob2));
            System.out.println("Is object 1 is equal to object 2 ? true/false: "+ ob.isequal(ob2));
            System.out.println("Is object 1 is less than object 2 ? true/false: "+ ob.lessthan(ob2));
            System.out.println("Is object 1 is greater than object 2 ? true/false: "+ ob.greaterthan(ob2));
            System.out.println("Is object 1 is not equal to object 2 ? true/false: "+ ob.isnotequal(ob2));
            System.out.println("Is object 1 is greater or equal to object 2 ? true/false: " +ob.greaterEqual(ob2));
            System.out.println("Is object 1 is less or equal to object 2 ? true /false: "+ ob.lessEqual(ob2));
            
        }
        catch(InputMismatchException err){
            System.out.println("incorrect input");
            JOptionPane.showMessageDialog(null, "Incorrect input");
        
        }
        
        
    }
    
}

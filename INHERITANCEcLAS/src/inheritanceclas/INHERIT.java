
package inheritanceclas;

/**
 *
 * @author bakhtiyar
 */
public class INHERIT {
    protected String name;
    protected int age;
    protected double salary;
    public void setNAS(String name,int age,double salary){
        this.name   = name;
        this.age    = age;
        this.salary = salary;
    }
    public String getname(){
    return this.name;
    }
    public int getage(){
    return this.age;
    }
    public double getsalary(){
    return this.salary;
    }
    
}

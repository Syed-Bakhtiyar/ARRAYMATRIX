package polymorphism.inherit;
/**
 *
 * @author bakhtiyar
 */
public class child extends parent {
    private String name;
    private String education;
    private int age;
    private String experience;
    public void setData(String name,String education,int age, String experience){
    this.name = name;
    this.education = education;
    this.age = age;
    this.experience = experience;
    }
    public String getTname(){
    return this.name;
    }
    public String getTeducation(){
    return this.education;
    }
    public int getTage(){
    return this.age;
    }
    public String getTexp(){
    return this.experience;
    }
}
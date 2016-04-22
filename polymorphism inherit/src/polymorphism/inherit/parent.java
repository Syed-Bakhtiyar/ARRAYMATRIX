/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism.inherit;

/**
 *
 * @author bakhtiyar
 */
public class parent {
    protected String name;
    protected String education;
    protected String phn;
    protected String fathername;
    protected int age;
    protected float marks;
    public parent(){}
    public parent(String name, String education, String phn,String fathername,int age,float marks){
    this.name= name;
    this.education= education;
    this.phn = phn;
    this.fathername = fathername;
    this.age = age;
    this.marks = marks;
    }
    public void SetDetail(String name,String education,String phn,String fathername,int age,float marks){
    this.name = name;
    this.education = education;
    this.phn = phn;
    this.fathername = fathername;
    this.age=age;
    this.marks = marks;
    }
    public String getname(){
    return this.name;
    }
    public String getedu(){
    return this.education;
    }
    public String getPhn(){
    return this.phn;
    }
    public String getFathername(){
    return this.fathername;
    }
    public int getage(){
    return this.age;
    }
    public float getMarks(){
    return this.marks;
    }
    
}

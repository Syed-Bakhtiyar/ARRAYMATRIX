package stringconcat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bakhtiyar
 */
public class strcnt {
    private String add;
    private String name2;
    void set(String a,String b){
    this.add = a;
    this.name2=b;
   }
    String get(){
    String concatenate;
    concatenate = add +name2;
    return concatenate;
    }
}

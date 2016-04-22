package stringfunction;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bakhtiyar
 */
public class stringfunctioncall {
    private String sen;
    private String sen2;
    public void add(String sen,String sent2){
    this.sen=sen;
    this.sen2=sent2;
    }
    
    public int comp(){
        int x;
        x=sen2.compareTo(sen);
        return x;
    }
    public void concat(){
    System.out.printf("%s\n",sen.concat(sen2));
    }
    public void length(){
    System.out.printf("length of sen is: %s%n", sen.length());
    System.out.printf("length of sen2 is: %s%n", sen2.length());
    }
}

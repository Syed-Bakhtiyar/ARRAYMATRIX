/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacktest;

/**
 *
 * @author bakhtiyar
 */
public class StackClass {
private int[] data = new int[10];
private int count;
public StackClass(){
count =-1;
}
public void insert(int x){
if(count>9){
System.err.println("STACK IS FULL");
}else{
count++;
    data[count]= x;
}
}
public void delt(){
    count--;
}
public void search(int x){
    int c=0;
    for(int i=0;i<count;i++){
        if(x==data[i]){
        System.out.println("number is found");
        c++;
       }
    }
     if(c==0){
         System.out.println("NUMBER NOT FOND IN DATA");
     }
}
public void sortingDisplay(){
    int[] arr = new int[10];
    int i;
    for(i=0;i<=count;i++){
    arr[i] = data[i];
    }
    for(i=0;i<count;i++){
        for(int j=(i+1);j<=count;j++){
            if(arr[i]>arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
            
    }
    System.out.println("\t\tsorting data is");
    for(i=0;i<=count;i++){
    System.out.println(arr[i]);
    }
    
}
public void display(){
    System.out.println("\t\t");
    for(int i=0;i<=count;i++){
        System.out.println(data[i]);
    }
    System.out.println();
    
}

   



}

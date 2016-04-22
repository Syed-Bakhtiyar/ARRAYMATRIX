package stackexit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bakhtiyar
 */
public class stack {
    private int[] data = new int[10];
    private int count;
    public stack(){
    count =-1;
    }
    void put(int a){
        count++;
        this.data[count]=a;
    }
    void pop(){
         count--;
    }
    void sort(){
        for(int i=0;i<count;i++){
            for(int j=i+1;j<count;j++){
                if(data[i]>data[j]){
                int temp = data[i];
                data[i]=data[j];
                data[j]=temp;
                }
            }
        }
    }
    void display(){
        int num=0;
        int i;
        for(i=0;i<=count;i++){
            System.out.printf("%d\t\n",data[i]);
            num++;
        }
        
        if(num==0){
            System.out.println("there is no data to display");
        }
    }
    void search(int x){
        int f=0;
        for(int i=0;i<count;i++){
            if(data[i]==x){
                System.out.printf("%d is found in data\n",x);
                f++;
            }
        }
        if(f==0){
            System.out.printf("%d is not found in data/n",x);
        }
    }
    
}

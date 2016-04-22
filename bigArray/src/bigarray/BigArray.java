/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigarray;
import java.util.Scanner;
//1.sort,2.matrix,3,average,indent aur khubsurti ksath kl tayaar hojay ga
/**
 *
 * @author bakhtiyar
 */
public class BigArray {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("1.sort\n2.Matrix\n3.average");
    int a;
    System.out.println("chose your length: ");
    Scanner input= new Scanner(System.in);
    a=input.nextInt();
    int[] no=new int[a];
    for(int k=0; k<a; k++){
        no[k]=input.nextInt();
    }
    for(int i=0; i<a; i++){
        for(int j=i+1; j<a; j++){
            if(no[i]>no[j]){
                int temp=no[i];
                no[i]=no[j];
                no[j]=temp;
            }
        }
    }
    System.out.println("output");
    for(int p=0; p<a; p++){
        System.out.printf("\n%d%n",no[p]);
    }
    }
}

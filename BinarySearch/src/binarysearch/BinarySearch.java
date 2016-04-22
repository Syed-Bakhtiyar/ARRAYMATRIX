/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;
import java.util.Scanner;
import java.security.SecureRandom;

/**
 *
 * @author bakhtiyar
 */
public class BinarySearch {

    
    public static void main(String[] args) {
    int[] arr = new int[10];
    int i=0,find,low,high,mid,tempsr;
    mid = (arr.length-1)/2;
    Scanner input = new Scanner(System.in);
    SecureRandom in = new SecureRandom();
    for(;i<arr.length;i++){
        arr[i]= (int) Math.random()*100;
// arr[i] = in.nextInt(100);
    }
    for(i=0;i<arr.length;i++){
        for(int j =i+1;j<arr.length;j++){
            if(arr[i]>arr[j]){
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j]= temp;
            }
        
        }
    
    }
    for(i=0;i<arr.length;i++){
    System.out.println(arr[i]);
    }
    System.out.print("Enter number to find data: ");
    find = input.nextInt();
    int v=mid;
    while(true){
    
    if(find == arr[v]){
        System.out.println("number is found in "+v+" index");
    }
    if(find<arr[v]){
        v = v/2;
        
    }
    if(find>arr[v]){
    v= (v+1)+(arr.length-1);
    v=v/2;
    
    }
    
    
    }
    
    
    }
    
}

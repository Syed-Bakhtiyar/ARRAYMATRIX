/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytreequeue;
import java.util.Scanner;


public class BinaryTreeQueue {
public int data;
public BinaryTreeQueue leftchild=null;
public BinaryTreeQueue rightchild=null;


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BinaryTreeQueue head = new BinaryTreeQueue();
        System.out.print("enter a data (number): ");
        int data=input.nextInt();
        head.data = data;
        head.leftchild=null;
        head.rightchild =null;
    }
    
}

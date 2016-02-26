/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectedaverage;
import java.util.Scanner;
/**
 *
 * @author bakhtiyar
 */
public class SelectedAverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char ag;
        Scanner input = new Scanner(System.in);
        do{
        System.out.println("Salary average");
        int choice,i;
        float average;
        System.out.print("what list do you wan't?: ");
        choice = input.nextInt();
        float[] list = new float[choice];
        for(i=0;i<list.length;i++){
        list[i] = input.nextFloat();
        }
        average = aver(list);
        System.out.println("AVERAGE IS: "+ average);
        System.out.println("DO YOU WAN'T TO ADD AGAIN? y/n");
        String ch = input.next();
         ag = ch.charAt(0);
        }while(ag!='n');
        
    }
    public static float aver(float[] x){
    int temp=0;
    for(int i=0;i<x.length;i++){
    temp+=x[i];
    }
    return (temp/x.length);
    }
}

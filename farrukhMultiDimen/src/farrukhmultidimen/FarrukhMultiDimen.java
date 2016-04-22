/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farrukhmultidimen;

/**
 *
 * @author bakhtiyar
 */
public class FarrukhMultiDimen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int[][] a = new int[2][2];
     float[][] b = new float[2][2];
     for(int i=0;i<a.length;i++){
         for(int j=0;j<a.length;j++){
         a[i][j] = (2*i);
         }
     }
     System.out.println("output");
     for(int i=0;i<a.length;i++){
         for(int j=0;j<a.length;j++){
              System.out.println(a[i][j]);
         }
       }
     funct(a);
    }
    public static void funct(int[][] b){
    System.out.println("output");
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b.length;j++){
            System.out.println(b[i][j]);
            }
    
    }
    }
    
}

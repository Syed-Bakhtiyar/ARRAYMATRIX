/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templategenerics;

/**
 *
 * @author bakhtiyar
 */
public class TemplateGenerics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[] intArray ={1,2,3,4,5};
        Double[] doubleArray = {1.2,2.2,3.3,4.4,5.5};
        Character[] charArray = {'A','B','C','D','E'};
        printArray(intArray);
        printArray(doubleArray);
        printArray(charArray);
    }
    public static <T> void printArray(T[] inputArray){
    for(T a:inputArray){
    System.out.println(a);
    }
    
    }
    
}

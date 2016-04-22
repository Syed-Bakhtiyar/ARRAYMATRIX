package averarrclass;



/**
 *
 * @author bakhtiyar
 */
public class arrr {
    private int[] arr = new int[10];
    public void inp(int[] arr){
    this.arr = arr;
    }
    public int avr(){
    int temp=0;
    for(int i=0;i<10;i++){
    temp+=arr[i];
    }
    return temp;
    
    }
    
}

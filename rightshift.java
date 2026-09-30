//Shift all elements to the right by one position int [] arr= {5,2,9,1,7,3 }
import java.util.Arrays;
public class rightshift {
    public static void main(String [] args){
        int [] arr= {5,2,9,1,7,3};
        int last = arr[arr.length-1];
        for(int i=arr.length -1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=last;
        System.out.println("Right Shifted Arrays="+ Arrays.toString(arr));
    }
    
}

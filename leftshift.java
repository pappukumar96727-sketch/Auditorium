//Shift all elements to the left by one position
import  java.util.Arrays;
public class leftshift{
    public static void main(String [] args){
        int [] arr= {5,2,9,1,7,3};
        int first =arr[0];
        for(int i=0; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1]=first;
        System.out.println("Left Shifted Arrays = "+ Arrays.toString(arr));
        }
}
//find sum of the array elements
public class question1{
    public static void main(String [] args){
        int [] arr = {5,2,1,9,7};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("sum of the elements = " + sum);
    }
}
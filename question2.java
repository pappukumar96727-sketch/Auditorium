//find the average of array elements
public class question2{
    public static void main(String [] args){
        int [] arr = {5,2,1,9,7};
        double sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("average of the elements =" +sum/arr.length);
    }
}
public class question5 {
    public static void main(String [] args){
        int [] arr={5,2,9,2,7,2};
        int key=2;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                count++;
            }
        }
        System.out.println("the number of occurence of " + key +" is = "+ count);
    }
}

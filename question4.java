public class question4 {
    public static void main(String [] arg){
        int [] arr={2,3,5,7,9,11,13};
        // int n=arr.length;
        int [] newArr=arr.clone();
        System.out.print("arr = ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("newArr = ");
        for(int i=0;i<newArr.length;i++){
            System.out.print(newArr[i] + " ");
        }
        System.out.println();
    }
    
}

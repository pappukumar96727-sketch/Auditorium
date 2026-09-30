public class question7 {
    public static void main (String [] args){
        int [] arr={5,2,9,2,7,2};
        int key=9;
        boolean isfound=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                isfound=true;
                break;
            }
        }
        System.out.println("Contains "+key +" ? = "+ isfound);
    }
}

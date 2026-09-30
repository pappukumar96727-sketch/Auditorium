public class question8 {
    public static void main(String[] args){
        int [] arr={ 5,2,9,2,7,2};
        int evenCount =0;
        int oddCount =0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                evenCount++;
            }
                else{
                    oddCount++;
                }
            }
            System.out.println("even count = "+ evenCount);
            System.out.println("odd count = "+ oddCount);
        }
    }
    

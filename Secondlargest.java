public class Secondlargest {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7, 3};
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int n : arr) {
            if (n > largest) {
                second = largest;
                largest = n;
            } else if (n > second && n != largest) {
                second = n;
            }
        }

        System.out.println("Second largest = " + second);
    }
}
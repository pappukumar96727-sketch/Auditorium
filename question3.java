public class question3 {
    public static void main(String[] args) {
        int[] arr = { 9, 3, 4, 5, 6, 7, 2 };
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
            if (arr[i] < minimum) {
                minimum = arr[i];
            }
        }

        System.out.println("Maximum element: " + maximum);
        System.out.println("Minimum element: " + minimum);
    }
}

import java.util.Arrays;
import java.util.Collections;

public class dessendingordersoorting {
    public static void main(String[] args) {
        Integer[] arr = { 5, 2, 9, 1, 7, 3 };
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Descending order =" + Arrays.toString(arr));
    }
}

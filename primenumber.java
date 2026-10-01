import java.util.*;
public class primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num <= 1) {
            System.out.println(num + " is not a prime number.");
        } else if (num == 2) {
            System.out.println(num + " is a prime number.");
        } else if (num % 2 == 0) {
            System.out.println(num + " is not a prime number.");
        } else {
            boolean isPrime = true;
            for (int i = 3; i * i <= num; i += 2) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        }
    }
}

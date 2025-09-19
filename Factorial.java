import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a non-negative number:");
        int n = sc.nextInt();
        long factorial = 1;

        if (n < 0) {
            System.out.println("Please enter a positive number.");
        } else {
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + n + " is: " + factorial);
        }

        sc.close();
    }
}

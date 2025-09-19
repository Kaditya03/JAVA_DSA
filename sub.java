import java.util.*;

public class sub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Integer:");
        int n = sc.nextInt();
        sc.close();

        int product = 1;
        int sum = 0;
        int temp = Math.abs(n);

        while (temp != 0) {
            int digit = temp % 10;
            product *= digit;
            sum += digit;
            temp /= 10;
        }
        int result = product - sum;
        System.out.println("Product of digits is:" + product);
        System.out.println("The sum of digits is:" + sum);
        System.out.println("The result is:" + result);
        System.out.println(result);
    }
}

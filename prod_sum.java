import java.util.*;

public class prod_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        int original = n;
        int sum = 0;
        int product = 1;

        while (n != 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n = n / 10;
        }
        int result = product - sum;

        System.out.println("Orginal Number");
        System.out.println("sum of digits:" + sum);
        System.out.println("product of digits:" + product);
        System.out.println("result:" + result);
        sc.close();
    }
}

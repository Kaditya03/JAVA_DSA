import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = sc.nextInt();
        System.out.println("Enter another Number:");
        int m = sc.nextInt();
        System.out.println("Armstrong numbers between" + n + "and" + m + ":");
        for (int num = n; num <= m; num++) {
            int digits = String.valueOf(num).length();
            int temp = num, sum = 0;
            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }
            if (sum == num) {
                System.out.println(num);
            }
        }
        sc.close();
    }
}

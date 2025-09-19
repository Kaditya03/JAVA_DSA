import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many Fibonacci numbers to display: ");
        int n = sc.nextInt();

        int first = 0, second = 1;
        System.out.println("Fobonacci series upto " + n + "numbers");
        for (int i = 1; i <= n; i++) {
            System.out.println(first + "");
            int next = first + second;
            first = second;
            second = next;
        }
        sc.close();
    }
}

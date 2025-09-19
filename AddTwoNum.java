import java.util.*;

public class AddTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num:");
        int a = sc.nextInt();
        System.out.println("Enter another num:");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum of two numbers is: " + sum);
        sc.close();
    }
}

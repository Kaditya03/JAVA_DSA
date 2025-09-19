import java.util.*;

public class large {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1:");
        double num1 = sc.nextDouble();
        System.out.println("Enter num2");
        double num2 = sc.nextDouble();
        if (num1 > num2) {
            System.out.println("num1 is larger");
        } else if (num2 > num1) {
            System.out.println("num2 is larger");
        } else {
            System.out.println("both are equal");
        }
        sc.close();
    }
}

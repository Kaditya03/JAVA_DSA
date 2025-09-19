import java.util.*;

public class MaxMin {

    public static void min(int num1, int num2, int num3) {
        int min = Math.min(Math.min(num1, num2), num3);
        System.out.println("Min is:" + min);
    }

    public static void max(int num1, int num2, int num3) {
        int max = Math.max(Math.max(num1, num2), num3);
        System.out.println("Max is:" + max);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1:");
        int num1 = sc.nextInt();
        System.out.println("Enter num2:");
        int num2 = sc.nextInt();
        System.out.println("Enter num3:");
        int num3 = sc.nextInt();

        min(num1, num2, num3);
        max(num1, num2, num3);

        sc.close();
    }

}

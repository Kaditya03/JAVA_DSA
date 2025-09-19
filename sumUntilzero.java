import java.util.*;

public class sumUntilzero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int sum = 0;
        System.out.println("Enter the numbers to add(0 to stop)");

        while (true) {
            number = sc.nextInt();
            if (number == 0) {
                break;
            }
            sum += number;
        }
        System.out.println("Sum of numbers until 0 is:" + sum);
        sc.close();
    }

}

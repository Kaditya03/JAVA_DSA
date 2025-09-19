import java.util.Scanner;

public class LargestUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int largest = Integer.MIN_VALUE;

        System.out.println("Enter numbers (enter 0 to stop):");

        while (true) {
            number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            if (number > largest) {
                largest = number;
            }
        }

        if (largest == Integer.MIN_VALUE) {
            System.out.println("No numbers were entered.");
        } else {
            System.out.println("The largest number is: " + largest);
        }

        scanner.close();
    }
}

import java.util.*;

public class ElecBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter units consumed");
        int units = scanner.nextInt();
        double bill = 0;

        if (units <= 100) {
            bill = units * 1.5;
        } else if (units <= 200) {
            bill = (100 * 1.5) + (100 * 2.5) + ((units - 300) * 6.0);
        } else if (units <= 300) {
            bill = (100 * 1.5) + (100 * 2.5) + ((units - 200) * 4.0);
        } else {
            bill = (100 * 1.5) + (100 * 2.5) + (100 * 4.0) + ((units - 300) * 6.0);
        }
        System.out.printf("total bill for %d units is:rs %.2f%n", units, bill);
        scanner.close();
    }
}

import java.util.*;

public class conver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount in Rupees:");
        double amount = sc.nextDouble();

        double usd = amount / 83.54;
        System.out.println("Amount in Dollar is:" + usd);
        sc.close();
    }
}

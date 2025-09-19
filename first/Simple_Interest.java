package first;

import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Pricipal Amount:");
        double P = sc.nextDouble();
        System.out.println("Enter the Time Period:");
        double T = sc.nextInt();
        System.out.println("Enter the Rate of Interest:");
        double R = sc.nextDouble();
        double SI = (P * T * R) / 100;
        System.out.println("Simple Interest is :" + SI);

    }
}

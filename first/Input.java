package first;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String name = scanner.nextLine();
        System.out.println(name + " Welcome!");
        scanner.close();
    }
}

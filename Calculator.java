import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        while (true) {
            System.out.print("Enter the Operator (+, -, *, /, %) or x to exit: ");
            char op = in.next().trim().charAt(0);
            if (op == 'x' || op == 'X') {
                System.out.println("Exiting Calculator.");
                break;
            }
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter two numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                System.out.println();
                if (op == '+') {
                    ans = num1 + num2;
                } else if (op == '-') {
                    ans = num1 - num2;
                } else if (op == '*') {
                    ans = num1 * num2;
                } else if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                        continue;
                    }
                } else if (op == '%') {
                    ans = num1 % num2;
                }
                System.out.println("Answer: " + ans);
            } else {
                System.out.println("Invalid Operation!!");
            }
        }
        in.close();
    }
}

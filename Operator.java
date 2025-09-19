
import java.util.*;

public class Operator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double num = input.nextDouble();
        System.out.println("Enter another number: ");
        double num2 = input.nextDouble();
        System.out.println("Enter the Operator (*,-,+,/):");
        char operator = input.next().charAt(0);
        double result;

        if (operator == '+') {
            result = num + num2;
            System.out.println("Result: " + result);
        } else if (operator == '-') {
            result = num - num2;
            System.out.println("Result: " + result);
        } else if (operator == '*') {
            result = num * num2;
            System.out.println("Result: " + result);
        } else if (operator == '/') {
            if (num2 != 0) {

                result = num / num2;
                System.out.println("Result: " + result);
            } else {
                System.out.println("Error divison by Zero");
            }
        } else {
            System.out.println("Invalid Operator");
        }
        input.close();
    }

}

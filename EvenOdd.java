import java.util.*;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double num = sc.nextDouble();
        if (num % 2 == 0) {
            System.out.println("the num is even");
        } else {
            System.out.println("the num is odd");
        }
        sc.close();
    }
}i

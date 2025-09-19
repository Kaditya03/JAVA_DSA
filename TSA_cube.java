import java.util.*;

public class TSA_cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = -1;
        while (a <= 0) {
            System.out.println("Enter the edge of the length of cube:");
            a = sc.nextDouble();
            if (a <= 0) {
                System.out.println("must be greater than zero");
            }
        }
        double TSA = 6 * a * a;
        System.out.println("TSA of cube is:" + TSA);
        sc.close();

    }
}

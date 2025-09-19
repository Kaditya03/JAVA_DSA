import java.util.*;

public class Circle_area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle:");
        double r = sc.nextDouble();
        double area = Math.PI * r * r;
        System.out.println("Area of the circle is :" + area);
        sc.close();
    }
}
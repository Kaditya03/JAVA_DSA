import java.util.*;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = -1;
        while (r < 0) {
            System.out.println("Enter the radius of the sphere:");
            r = sc.nextDouble();
            if (r <= 0) {
                System.out.println("Invalid input. Please enter a positive value for the radius.");
            }
            sc.close();
        }
        double volume = (4 / 3) * Math.PI * Math.pow(r, 3);
        System.out.println("the volume of sphere is :" + volume);
    }
}

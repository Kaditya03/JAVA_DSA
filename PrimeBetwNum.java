import java.util.*;

public class PrimeBetwNum {
    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static List<Integer> primeBetw(int start, int end) {
        List<Integer> primeList = new ArrayList<>();

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primeList.add(i);
            }
        }
        return primeList;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start Num:");
        int start = sc.nextInt();
        System.out.println("Enter end Num:");
        int end = sc.nextInt();

        List<Integer> primes = primeBetw(start, end);

        System.out.println("Prime numbers between " + start + " and " + end + ":");
        System.out.println(primes);

        sc.close();

    }
}

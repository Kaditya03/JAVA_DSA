public class NextPrime {
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n == 2)
            return true;
        if (n % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void printNextPrimes(int start, int count) {
        int printed = 0;
        int number = start + 1;

        while (printed < count) {
            if (isPrime(number)) {
                System.out.print(number);
                printed++;
            }
            number++;
        }
    }

    public static void main(String[] args) {
        int startNumber = 10;
        int numberOfPrimes = 5;
        System.out.println("Next" + numberOfPrimes + "prime number after" + startNumber + ":");
        printNextPrimes(startNumber, numberOfPrimes);

    }
}

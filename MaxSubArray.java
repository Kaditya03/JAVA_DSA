public class MaxSubArray {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6 };
        int maxSoFar = arr[0], maxEndingHere = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        System.out.println("Maximum subarray sum: " + maxSoFar);
    }
}

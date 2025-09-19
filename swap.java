import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 9, 7 };
        swap(arr, 1, 3);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

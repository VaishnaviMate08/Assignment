package Array1;
public class LeftRotateArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int k = 2; // Number of positions to rotate

        int n = arr.length;
        k = k % n; // In case k > n

        int[] rotated = new int[n];

        // Copy elements from k to end
        for (int i = 0; i < n - k; i++) {
            rotated[i] = arr[i + k];
        }

        // Copy first k elements to the end
        for (int i = 0; i < k; i++) {
            rotated[n - k + i] = arr[i];
        }

        // Print result
        System.out.print("Array after " + k + " left rotations: ");
        for (int num : rotated) {
            System.out.print(num + " ");
        }
    }
}
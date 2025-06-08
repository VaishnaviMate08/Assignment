package Array1;
public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {0, 5, 0, 3, 0, 2, 7, 0};

        int index = 0; // Position to place the next non-zero

        // Move all non-zero elements to the front
        for (int num : arr) {
            if (num != 0) {
                arr[index++] = num;
            }
        }

        // Fill remaining positions with zero
        while (index < arr.length) {
            arr[index++] = 0;
        }

        // Print result
        System.out.print("Array after moving zeros: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
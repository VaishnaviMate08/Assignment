package Array1;

public class ReverseArrayWithExtraSpace {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int[] reversed = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }

        // Print reversed array
        System.out.print("Reversed array: ");
        for (int num : reversed) {
            System.out.print(num + " ");
        }
    }
}
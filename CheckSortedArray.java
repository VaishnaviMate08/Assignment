package Array1;
public class CheckSortedArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50}; // Change values to test

        boolean isAscending = true;
        boolean isDescending = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isAscending = false;
            }
            if (arr[i] < arr[i + 1]) {
                isDescending = false;
            }
        }

        if (isAscending) {
            System.out.println("Array is sorted in ascending order.");
        } else if (isDescending) {
            System.out.println("Array is sorted in descending order.");
        } else {
            System.out.println("Array is not sorted.");
        }
    }
}
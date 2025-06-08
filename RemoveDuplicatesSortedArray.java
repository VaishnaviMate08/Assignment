package Array1;
public class RemoveDuplicatesSortedArray {
    public static void main(String[] args) {
        int[] arr = {10, 10, 20, 20, 30, 30, 40};

        int n = arr.length;

        if (n == 0 || n == 1) {
            System.out.println("Array after removing duplicates:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            return;
        }

        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1]; // add last element

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
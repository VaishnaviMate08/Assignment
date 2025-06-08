package Array1;
import java.util.HashMap;

public class ElementFrequency {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 10, 40};

        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num : arr) {
            // If element already exists, increment count
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Print frequencies
        System.out.println("Element Frequencies:");
        for (int key : freqMap.keySet()) {
            System.out.println(key + " => " + freqMap.get(key));
        }
    }
}
import java.io.*;

public class SCountingS {
    public static void countingsort(int arr[]) {
        // Find the largest element in the array
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // Create the count array
        int count[] = new int[largest + 1];

        // Count the occurrences of each element
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Sorting the array
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j++] = i;
                count[i]--;
            }
        }
    }

    // Test the counting sort
    public static void main(String[] args) {
        int arr[] = {4, 2, 2, 8, 3, 3, 1};
        countingsort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

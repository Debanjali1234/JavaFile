import java.io.*;

public class SInsertionS {

    public static void SelectionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 7, 8, 3, 1, 2 };
        System.out.println("original array");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("  ");
        SelectionSort(arr);
        System.out.println("Sorted array");
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

}

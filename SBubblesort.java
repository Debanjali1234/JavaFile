import java.io.*;

public class SBubblesort {

    public static void sorting(int arr[]) {
        for (int n = 0; n < arr.length; n++) {
            for (int j = 0; j < arr.length - 1 - n; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
    }

    public static void bubblesort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int arr[] = { 5, 6, 9, 7, 2, 1, 67 };
        sorting(arr);
        bubblesort(arr);
    }
}
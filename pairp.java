import java.util.Scanner;

public class pairp {
    static void findPairSum(int[] arr, int n, int target) {

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " " + arr[j]);

                }

            }

        }
        {
            System.out.println("No pair found");

        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int target = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        findPairSum(arr, n, target);

    }
}

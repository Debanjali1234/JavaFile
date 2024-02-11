import java.io.*;

public class leftdiagonalM {
    public static void main(String args[]) throws IOException {
        int arr[][] = new int[3][3];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("enter the number");
                arr[i][j] = Integer.parseInt(br.readLine());
            }
        }
        System.out.println("print the ARRAY");
        for (int i = 0; i < 3; i++) {
            System.out.println(" ");

            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }

        }
        System.out.println("print the left diagonal element");
        int n = 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i][j]);
                }
            }
            System.out.println(" ");

        }
    }
}

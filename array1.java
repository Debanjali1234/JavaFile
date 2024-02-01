import java.io.*;

public class array1 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(br.readLine());
            }

        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)

                System.out.print(arr[i][j] + " ");
            System.out.println();
        }

    }
}

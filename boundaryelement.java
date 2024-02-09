import java.io.*;

class boundaryelement {
    public static void main(String arg1[]) throws IOException {
        int arr[][] = new int[3][3];
        BufferedReader tani = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.println("Enter a number ");
                arr[i][j] = Integer.parseInt(tani.readLine());
            }
        }
        System.out.println("Display 2D array");
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {

                System.out.print(arr[i][j]);

            }
            System.out.println(" ");
        }
        System.out.println("display boundaryelement");
        int n = 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 0 || i == n - 1 || (i == 1 && (j == 0 || j == n - 1))) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }

    }
}
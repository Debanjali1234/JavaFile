import java.io.*;
import java.util.Scanner;

public class CO2DA {

    public static void main(String[] args) {

        // INPUT METHOD:-

        int matrix[][] = new int[3][3];

        int n = matrix.length, m = matrix[0].length;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                matrix[i][j] = sc.nextInt();
            }
        }
        // print method:-

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                System.out.print(matrix[i][j] + "  ");

            }
            System.out.println();

        }

    }
}
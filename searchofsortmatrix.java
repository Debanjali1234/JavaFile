import java.io.*;

public class searchofsortmatrix {

    public static boolean searchmatrix(int matrix[][], int key) {
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {

            if (matrix[row][col] == key) {

                System.out.print("we found the value at (" + row + "," + col + ")");
                return true;

            } else if

            (key < matrix[row][col]) {
                col--;
            } else {
                row++;

            }
        }
        System.out.print("we not found ");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 40 },
                { 16, 17, 18, 19 },
                { 26, 27, 28, 29 } };

        int key = 35;
        searchmatrix(matrix, key);
    }
}
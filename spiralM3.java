import java.io.*;

public class spiralM3 {

    public static void printspiral(int matrix[][]) {

        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length - 1;
        int endcols = matrix[0].length - 1;

        while (startrow <= endrow && startcol <= endcols) {

            // Top row: Traverse from left to right
            for (int j = startcol; j <= endcols; j++) {
                System.out.print(matrix[startrow][j] + " ");
            }
            startrow++; // Increment startrow after top row traversal

            // Right column: Traverse from top to bottom
            for (int i = startrow; i <= endrow; i++) {
                System.out.print(matrix[i][endcols] + " ");
            }
            endcols--; // Decrement endcols after right column traversal

            // Bottom row: Traverse from right to left if it's different from the top row
            if (startrow <= endrow) {
                for (int j = endcols; j >= startcol; j--) {
                    System.out.print(matrix[endrow][j] + " ");
                }
                endrow--; // Decrement endrow after bottom row traversal
            }

            // Left column: Traverse from bottom to top if it's different from the right
            // column
            if (startcol <= endcols) {
                for (int i = endrow; i >= startrow; i--) {
                    System.out.print(matrix[i][startcol] + " ");
                }
                startcol++; // Increment startcol after left column traversal
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 3, 4, 5, 6 },
                { 7, 8, 9, 10 },
                { 11, 12, 13, 14 },
                { 15, 16, 17, 18 }
        };

        printspiral(matrix);

        int matrix2[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        printspiral(matrix2);
    }
}

// chatgpt

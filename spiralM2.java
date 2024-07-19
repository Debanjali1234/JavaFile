import java.io.*;

// for even case 4*4
public class spiralM2 {

    public static void printspiral(int matrix[][]) {

        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length - 1;
        int endcols = matrix[0].length - 1;

        while (startrow <= endrow && startcol <= endcols) {

            // top:-
            for (int j = startcol; j <= endcols; j++) { // HERE J= COLS ND I=ROWS

                System.out.print(matrix[startrow][j] + " ");
            }
            // Right:-
            for (int i = startrow + 1; i <= endrow; i++) {

                System.out.print(matrix[i][endcols] + " ");
            }
            // Bottom:-
            for (int j = endcols - 1; j >= startcol; j--) {

                if (startrow == endrow) {

                    break;
                }

                System.out.print(matrix[endrow][j] + " ");
            }
            // left:-
            for (int i = endrow - 1; i >= startrow + 1; i--) {

                if (startcol == endcols) {

                    break;

                }

                System.out.print(matrix[i][startcol]);
            }
            startcol++;
            startrow++;
            endrow--;
            endcols--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int matrix[][] = { { 3, 4, 5, 6 },
                { 7, 8, 9, 10 },
                { 11, 12, 13, 14 },
                { 15, 16, 17, 18 } };
        printspiral(matrix);

    }

}
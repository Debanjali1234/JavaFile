import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the matrix: ");
        int n = scanner.nextInt();
        int[][] spiralMatrix = generateSpiralMatrix(n);
        printMatrix(spiralMatrix);
    }

    public static int[][] generateSpiralMatrix(int n) {
        int[][] matrix = new int[n][n];
        int num = 1;
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        
        while (num <= n * n) {
            for (int i = left; i <= right && num <= n * n; i++) {
                matrix[top][i] = num++;
            }
            top++;
            
            for (int i = top; i <= bottom && num <= n * n; i++) {
                matrix[i][right] = num++;
            }
            right--;
            
            for (int i = right; i >= left && num <= n * n; i--) {
                matrix[bottom][i] = num++;
            }
            bottom--;
            
            for (int i = bottom; i >= top && num <= n * n; i--) {
                matrix[i][left] = num++;
            }
            left++;
        }
        
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.printf("%4d", num);
            }
            System.out.println();
        }
    }
}

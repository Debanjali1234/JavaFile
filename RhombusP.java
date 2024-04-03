import java.io.*;

public class RhombusP {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the size");
        int n;
        n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {// sets the row
            for (int j = 0; j < i; j++) {// sets the space
                System.out.print(" ");

            }
            for (int k = 0; k < 5; k++) { // sets the star
                System.out.print("* ");
            }
            System.out.println(" ");

        }

    }
}

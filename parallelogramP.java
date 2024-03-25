import java.io.*;

public class parallelogramP {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the size");
        int n;
        n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {// for rows
            for (int j = n; j >= i; j--) {// for space
                System.out.print(" ");

            }
            for (int k = 1; k <= n; k++) { // for cols
                System.out.print(" * ");

            }
            System.out.println(" ");

        }

    }
}
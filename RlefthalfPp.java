import java.io.*;

public class RlefthalfPp {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" enter the size");
        int n;
        n = Integer.parseInt(br.readLine());
        for (int i = n; i >= 1; i--) {// for rows
            for (int j = 1; j <= (n - i); j++) {// for space
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {// for cols
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }

}

import java.io.*;

public class RRightHalfPp {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the size");
        int n;
        n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

}

import java.io.*;

public class SquareFillP {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the size");
        int r;
        r = Integer.parseInt(br.readLine());
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }

}

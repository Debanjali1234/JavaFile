import java.io.*;

public class numbertriangularp {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the size");
        int s;// s=size
        s = Integer.parseInt(br.readLine());
        for (int i = 1; i <= s; i++) {
            for (int j = 1; j > s; j--) {
                System.out.print(" ");
            }
            // d is using just printing the value
            for (int d = 1; d < i; d++) {
                System.out.print(i);
            }
            System.out.println();

        }

    }
}
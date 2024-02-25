import java.io.*;

public class squarehollowpattern {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter the size");
        int s;
        s = Integer.parseInt(br.readLine());
        for (int i = 1; i <= s; i++) {
            for (int j = 1; j <= s; j++) {
                if (i == 1 || i == s || j == 1 || j == s) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

    }

}

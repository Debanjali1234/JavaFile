import java.util.*;
import java.io.*;

class code5 {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int s2 = 0;
            int x = 1;
            for (int j = 0; j < n; j++) {
                int s = (x * b) + s2;
                System.out.print(s + a + " ");
                s2 = s;
                x = x * 2;

            }
            System.out.println();

        }
        in.close();
    }
}

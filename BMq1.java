import java.io.*;

class BMq1 {

    public static void bm1(int n) {

        if ((n & (n - 1)) == 0) {
            System.out.println(" power of 2");
        } else {
            System.out.println("not power of 2");
        }
    }

    public static void main(String[] args) {

        bm1(16);
        bm1(17);

    }
}

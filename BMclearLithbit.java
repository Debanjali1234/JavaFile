import java.io.*;

class BMclearLithbit {

    public static int BMclearlithbit(int n, int i) {

        int bitMask = (~0) << i;
        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(BMclearlithbit(13, 3));
    }
}
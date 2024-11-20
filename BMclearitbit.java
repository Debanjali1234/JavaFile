import java.io.*;

class BMclearitbit {

    public static int clearbit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(clearbit(10, 1));
    }
}
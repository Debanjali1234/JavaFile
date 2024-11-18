import java.io.*;

class BMsetitbit {

    public static int setitbit(int n, int i) {

        int bitMask = 1 << i;

        return n | bitMask;

    }

    public static void main(String args[]) {

        System.out.println(setitbit(10, 2));

    }
}
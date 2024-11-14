import java.util.*;

class bitModdAeven {

    public static void oddeven(int n) {

        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("even");
        }

        else {

            System.out.println("odd");
        }
    }

    public static void main(String args[]) {

        oddeven(3);
        oddeven(14);
        oddeven(5);
    }
}

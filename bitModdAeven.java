import java.util.*;

class bitModdAeven {

    public static void oddeven(int n) {

        int bitMask = 1;      // binary = 0001 .................................. so on
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

import java.util.*;

public class prefixmaxsumv {

    public static int maxsumvalue(int numbers[]) {
        int maxsum = 0;
        int currentsum = 0;
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];

        }

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currentsum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
            }

            if (maxsum < currentsum) {

                maxsum = currentsum;
            }

        }
        return maxsum;

    }

    public static void main(String[] args) {
        int numbers[] = { 3, 6, 7, 8, 9, 2, 67 };
        System.out.println(maxsumvalue(numbers));

    }
}

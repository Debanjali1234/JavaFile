import java.util.*;

public class kadanesalgo {

    public static int KADANESALGO(int numbers[]) {
        int sum = 0;
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {

            sum = sum + numbers[i];
            maxi = Math.max(sum, maxi);

            if (sum < 0) {
                sum = 0;

            }

        }
        return maxi;
    }

    public static void main(String[] args) {
        int numbers[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(KADANESALGO(numbers));

    }
}

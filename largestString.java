import java.io.*;

public class largestString {

    public static void main(String args[]) {

        String fruits[] = { " apple ", "Banana", "Gelly" };
        String largest = fruits[0];

        for (int i = 0; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];

            }

        }
        System.err.println(largest);

    }

}
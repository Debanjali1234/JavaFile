import java.io.*;
import java.util.Arrays;

public class Anagramstring {

    public static void main(String[] args) {

        String str1 = "man";
        String str2 = "nam";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() == str2.length()) {

            char[] array1 = str1.toCharArray();
            char[] array2 = str2.toCharArray();

            Arrays.sort(array1);
            Arrays.sort(array2);

            boolean result = Arrays.equals(array1, array2);

            if (result) {
                System.out.println(str1 + " " + str2 + " " + "are anagrams");
            } else {
                System.out.println(str1 + " " + str2 + " " + "are not anagrams");

            }
        } else {
            System.out.println(str1 + " " + str2 + " " + "are not anagrams");

        }

    }
}

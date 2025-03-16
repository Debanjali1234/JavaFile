import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next().replaceAll("\\s", "").toLowerCase();
        String str2 = scanner.next().replaceAll("\\s", "").toLowerCase();
        scanner.close();

        boolean isAnagram = areAnagrams(str1, str2);
        System.out.println(isAnagram ? "Anagrams" : "Not Anagrams");
    }

    private static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}

import java.util.Arrays;

public class Anagramstype2 {
    public static boolean areAnagrams(String str1, String str2) {
        // Remove all white spaces and convert strings to lower case
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if lengths of both strings are equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to char arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sort char arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted char arrays
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String string1 = "Listen";
        String string2 = "Silent";

        if (areAnagrams(string1, string2)) {
            System.out.println(string1 + " and " + string2 + " are anagrams.");
        } else {
            System.out.println(string1 + " and " + string2 + " are not anagrams.");
        }
    }
}
// hello

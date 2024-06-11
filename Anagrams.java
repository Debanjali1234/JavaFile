import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        a = a.replaceAll("\\s", "").toLowerCase();
        b = b.replaceAll("\\s", "").toLowerCase();

        if (a.length() != b.length()) {
            return false;
        }

        char[] array1 = a.toCharArray();
        char[] array2 = b.toCharArray();

        sortCharArray(array1);
        sortCharArray(array2);

        return isEqual(array1, array2);
    }

    static void sortCharArray(char[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    char temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    static boolean isEqual(char[] array1, char[] array2) {
        int n = array1.length;
        if (n != array2.length) {
            return false;
        }
        for (int i = 0; i < n; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
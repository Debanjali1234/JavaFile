import java.io.*;
import java.util.*;

public class code15 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();

        tokenizeString(s);
    }

    public static void tokenizeString(String s) {
        List<String> tokens = new ArrayList<>();
        StringBuilder token = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                token.append(c);
            } else {
                if (token.length() > 0) {
                    tokens.add(token.toString());
                    token.setLength(0); // Clear the StringBuilder
                }
            }
        }

        // Add the last token if there is one
        if (token.length() > 0) {
            tokens.add(token.toString());
        }

        // Print the number of tokens
        System.out.println(tokens.size());

        // Print each token on a new line
        for (String t : tokens) {
            System.out.println(t);
        }
    }
}

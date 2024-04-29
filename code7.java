import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class code7 {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        int linenumber = 1;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(linenumber + " " + line);
            linenumber++;

        }
        sc.close();
    }
}
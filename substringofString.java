import java.io.*;

public class substringofString {

    public static String subString(String str, int si, int Ei) {
        String S = " ";
        for (int i = si; i < str.length(); i++) {
            S += str.charAt(i);

        }
        return S;

    }

    public static void main(String args[]) {
        String str = "HELLOWORLD";
        System.out.println(str.substring(0, 5));

    }

}
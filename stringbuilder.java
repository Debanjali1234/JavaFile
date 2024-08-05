import java.io.*;

public class stringbuilder {

    public static void main(String args[]) {

        StringBuilder sb = new StringBuilder(" ");
        for (char sp = 'a'; sp <= 'z'; sp++) {
            sb.append(sp);

        }
        System.out.println(sb);
        System.out.println(sb.length());

    }

}
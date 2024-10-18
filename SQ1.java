import java.io.*;
import java.util.Scanner;

public class SQ1 {

    public static void main(String[] num) {

        
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.print("enter the string name:");
        String sr = sc.nextLine();
        for (int i = 0; i < sr.length(); i++) {
            char ch = sr.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }

        }

        System.out.println("the no. of vowles are:" + count);
    }

}

import java.io.*;

public class weird {
    public static void main(String[] args) {
        int n = 3;
        int m = 24;
        if (n % 2 != 0) {
            System.out.println("Weird");
        } else {
            if (n >= 2 && n <= 5) {
                System.out.println("Not Weird");
            } else if (n >= 6 && n <= 20) {
                System.out.println(" Weird");
            } else {
                System.out.println("Not weird");
            }

        }
        if (m % 2 != 0) {
            System.out.println("Weird");
        } else {
            if (m >= 2 && m <= 5) {
                System.out.println("Not Weird");
            } else if (m >= 6 && m <= 20) {
                System.out.println(" Weird");
            } else {
                System.out.println("Not weird");
            }
        }

    }

}
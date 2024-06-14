import java.io.*;

class overloading {
    static int add(int a, int b) {

        return (a + b);
    }

    static int add(int a, int b, int c) {
        return (a + b + c);
    }

    public static void main(String args[]) {
        System.out.println(" 2 number sum is");
        System.out.println(add(2, 3));
        System.out.println("3 number add is");
        System.out.println(add(3, 4, 5));
    }
}

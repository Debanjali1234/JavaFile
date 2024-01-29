import java.util.Scanner;

public class sumarray {
    public static void main(String args[]) {
        int n;
        System.out.println("enter the number of size");
        Scanner dev = new Scanner(System.in);
        n = dev.nextInt();
        System.out.println("enter the number of elements");

        int[] array = new int[n];

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = dev.nextInt();
            sum = sum + array[i];
        }
        System.out.println("sum=" + sum);

    }

}

import java.util.Scanner;

public class convert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryString = scanner.nextLine();

        // Converting binary to decimal
        int decimal = Integer.parseInt(binaryString, 2);

        System.out.println("The decimal equivalent is: " + decimal);

        scanner.close();
    }
}

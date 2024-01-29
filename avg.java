import java.util.Scanner;

public class avg {
    public static void main(String[] arg) {
        int num1, num2, num3, num4, num5;
        int max, min, sum;
        float avg;
        Scanner dev = new Scanner(System.in);
        System.out.println("enter the ist number");
        num1 = dev.nextInt();
        System.out.println("enter the 2nd number");
        num2 = dev.nextInt();
        System.out.println("enter the 3rd number");
        num3 = dev.nextInt();
        System.out.println("enter the 4th number");
        num4 = dev.nextInt();
        System.out.println("enter the 5th number");
        num5 = dev.nextInt();
        sum = (num1 + num2 + num3 + num4 + num5);
        avg = (sum / 5);
        System.out.println("sum=" + sum);
        System.out.println("avg=" + avg);
        

    }
}

import java.io.*;

public class amsN {
    public static void main(String[] args) throws IOException {

        int num, number, reminder, result = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a Number : ");
        num = Integer.parseInt(br.readLine());

        number = num;
        while (number != 0) {
            reminder = number % 10;
            result += reminder * reminder * reminder;
            number /= 10;

        }
        if (result == num)
            System.out.println("the number is an amsN" + num);
        else
            System.out.println("the result is not an amsN" + num);

    }

}

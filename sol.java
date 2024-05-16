import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class code10 {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     * 1. INTEGER month
     * 2. INTEGER day
     * 3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {

        Calendar calendar = Calendar.getInstance();

        // Set the year, month, and day
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1); // Calendar months are 0-based
        calendar.set(Calendar.DAY_OF_MONTH, day);

        // Get the day of the week as an integer (0 = Sunday, 1 = Monday, ..., 6 =
        // Saturday)
        int dayOfWeekInt = calendar.get(Calendar.DAY_OF_WEEK);

        // Convert the integer day of the week to a string representation
        String[] daysOfWeek = { "Sunday", "Monday", "Tuesday", "WEDNESDAY", "Thursday", "Friday", "Saturday" };
        String dayOfWeek = daysOfWeek[dayOfWeekInt - 1]; // Adjust for 0-based indexing

        // Return the day of the week
        return dayOfWeek;
    }

}

public class sol{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = code10.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

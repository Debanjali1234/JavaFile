import java.util.Calendar;
import java.util.Scanner;

public class calendar {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the year ");
        int year = sc.nextInt();

        System.out.println("enter the Month (12-1)"); // (In calendar Months are 0-based)
        int month = sc.nextInt();

        System.out.println("enter the day_of_week");
        int day = sc.nextInt(); // (for string)

        Calendar c = Calendar.getInstance();

        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, month - 1); // (January is 0 and December is 11)
        c.set(Calendar.DAY_OF_MONTH, day); // (1 for SUNDAY 2 for MONDAY)

        int dayofweek = c.get(Calendar.DAY_OF_WEEK);

        String dayName = " ";
        switch (dayofweek) {

            case Calendar.SUNDAY:
                dayName = "Sunday";
                break;
            case Calendar.MONDAY:
                dayName = "Monday";
                break;
            case Calendar.TUESDAY:
                dayName = "Tuesday";
                break;
            case Calendar.WEDNESDAY:
                dayName = "Wednesday";
                break;
            case Calendar.THURSDAY:
                dayName = "Thursday";
                break;
            case Calendar.FRIDAY:
                dayName = "Friday";
                break;
            case Calendar.SATURDAY:
                dayName = "Saturday";
        }

        System.out.println(day + "/" + month + "/" + year + " was a " + dayName);

        sc.close();

    }
}
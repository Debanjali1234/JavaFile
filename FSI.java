import java.io.*;

public class FSI {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the integer");
        int intValue = Integer.parseInt(br.readLine());
        System.out.println("enter the float value");
        float floatValue = Float.parseFloat(br.readLine());
        System.out.println("enter tthe string value");
        String stringValue = br.readLine();
        System.out.println("the integer value is " + intValue);
        System.out.println("the float value is" + floatValue);
        System.out.println("the string value is" + stringValue);

    }

}

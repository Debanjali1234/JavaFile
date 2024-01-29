public class factorial {
    public static void main(String args[]) {
        int n = 5;
        int f = 1;
        if (n < 0) {
            System.out.println("error factorial of neg.number doesn't exits");
        } else {
            for (int i = 1; i <= n; i++)
                f = f * i;

        }
        System.out.println("factorial of  " + n + " =" + f);

    }

}

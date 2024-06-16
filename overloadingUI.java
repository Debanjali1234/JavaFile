import java.util.Scanner;

class overloadingUI {
    static int add(int a, int b) {
        return (a + b);
    }

    static int add(int a, int b, int c) {
        return (a + b + c);
    }

    public static void main(String agrs[]) {
        Scanner sc = new Scanner(System.in);

        {
            System.out.println("add two numbers");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.println("sum of two numbers is ");
            System.out.println("Result" + add(num1, num2));

            System.out.println("add three numbers");
            int num3 = sc.nextInt();
            int num4 = sc.nextInt();
            int num5 = sc.nextInt();
            System.out.println("sum of three numbers is ");
            System.out.println("Result" + add(num3, num4, num5));

            sc.close();

        }

    }

}

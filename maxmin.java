public class maxmin {
    public static void main(String[] args) {
        int[] number = { 7, 6, 5, 8, 9 };
        int max = 0;//7,8,9
        int min = number[0];//6,5
        for (int i = 0; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
            }
        }
        for (int i = 0; i < number.length; i++) {
            if (number[i] < min) {
                min = number[i];
            }
        }
        System.out.println("max number is" + max);
        System.out.println("min number is " + min);

    }

}

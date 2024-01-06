
class swaping {
    public static void main(String[] args) {
        int a;
        int b;
        a=20;
        b=30;
        System.out.println("before swaping;a="+a+"b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swaping:a="+a+"b="+b);
    }
}
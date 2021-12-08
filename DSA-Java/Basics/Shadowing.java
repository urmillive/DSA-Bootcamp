public class Shadowing {
    static int x = 90;

    static void fun() {
        System.out.println(x);
    }

    public static void main(String[] args) {
        System.out.println(x);
        int x = 40;
        System.out.println(x);
        fun();
    }
}

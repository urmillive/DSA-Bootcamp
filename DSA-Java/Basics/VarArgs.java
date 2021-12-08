import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        // fun(2,43,543,53,4,5);
        multiple(1, 54, "kunal", "name");
    }

    static void multiple(int a, int b, String... v) {
        System.out.println(Arrays.toString(v));
    }

    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }
}

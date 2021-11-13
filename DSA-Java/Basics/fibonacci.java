package basics;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        for (int i = 1; i <= n; i++) {
            int temp = b;
            b = b + a;
            a = temp;
            System.out.println(b);
        }

    }
}

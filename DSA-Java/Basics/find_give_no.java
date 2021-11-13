package basics;

import java.util.Scanner;

public class find_give_no {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your match number: ");
        int m = in.nextInt();
        int n = 12212265;
        int count = 0;
        while (n > 0) {
            int remainder = n % 10;
            if (remainder == m) {
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }

}
package basics;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //take input from user till user does not press X or x
        int answer = 0;
        while (true) {
            //take the operator as input
            System.out.print("Enter operator: ");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                //input two numbers
                System.out.print("Enter two Numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                if (op == '+') {
                    answer = num1 + num2;
                }
                if (op == '-') {
                    answer = num1 - num2;
                }
                if (op == '*') {
                    answer = num1 - num2;
                }
                if (op == '/' && num2 != 0) {
                    answer = num1 / num2;
                }

            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid operations!!");
            }
            System.out.println(answer);
        }
    }
}

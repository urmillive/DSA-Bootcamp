import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextInt();
//        int num = input.nextFloat();
//        System.out.println(num);

//        type casting
        int num = (int) (123.44f);
        System.out.println(num);

//        automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte)(a);

        byte a = 10;
        byte b = 20;
        byte c = 30;
        int d = a * b / c;//200/30
        System.out.println(d);


        int number = 'A';
        System.out.println(number);

    }
}

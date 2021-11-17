import java.util.Scanner;

public class swith_case {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String fruit = in.next();

//        switch (fruit) {
//            case "mango" -> System.out.println("King of fruits");
//            case "chery" -> System.out.println("Red small & sweet fruit");
//            case "orange" -> System.out.println("sour yellow fruit");
//            default -> System.out.println("Invalid Fruits or may be something else!!");
//        }

        int day = in.nextInt();
//        switch (day) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Weekdays");
//                break;
//            case 6:
//            case 7:
//                System.out.println("Weekend");
//                break;
//        }

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekdays");
            case 6, 7 -> System.out.println("Weekend");
        }
    }
}

package basics;

import java.util.Scanner;

public class Nested_switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        //better way to write switch statements
        switch (empID) {
            case 1 -> System.out.println("Urmil Rupareliya");
            case 2 -> System.out.println("Rahul & Anjali");
            case 3 -> {
                System.out.println("Project Manager");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No department available!");
                }
            }
            default -> System.out.println("Enter correct values!!");
        }

    }
}

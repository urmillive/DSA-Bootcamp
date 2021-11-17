import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //while loop
//        int count = 1;
//        while (count != 5) {
//            System.out.println(count);
//            count++;
//        }


        //for loop
//        for (
//                int i = 1;
//                i <= 5; i++) {
//            System.out.println(i);
//        }

        //Q: Print numbers from 1 to 5
//        for(int i=1;i<=5;i++){
//            System.out.println(i);
//        }

        //Q: Print numbers from 1 to n for loop
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your N: ");
//        int n = sc.nextInt();
//
//        for(int i=1;i<=n;i+=1){
//            System.out.println(i);
//        }

        //Q: Print numbers from 1 to n using while loop

        System.out.print("Enter your N: ");
        int n = sc.nextInt();
//        int i=1;
//        while(i<=n){
//            System.out.println(i);
//            i+=1;
//        }

        //Do while loop demo
        int i=1;
        do{
            System.out.println(i);
            i+=1;
        }while(i>n); // loop run at least 1 time
    }
}


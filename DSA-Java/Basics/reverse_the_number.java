import java.util.Scanner;

public class reverse_the_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your Number: ");
        int n = in.nextInt();
        int answer  = 0;
        while(n>0){
            int remainder = n % 10;
            n = n / 10;
            answer = (answer*10)+remainder;
        }
        System.out.println(answer);
    }
}

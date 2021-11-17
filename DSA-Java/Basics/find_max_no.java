
import java.util.Scanner;

public class find_max_no {
        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);

                int a = in.nextInt();
                int b = in.nextInt();
                int c = in.nextInt();

                // Q: Find the largest of 3 numbers

                // 1st way
                // int max = a;
                // if (b > max) {
                // max = b;
                // }
                // if (c > max) {
                // max = c;
                // }

                // 2nd way
                // int max = Math.max(a,b);
                // if(c>max){
                // max = c;
                // }

                // 3rd way
                // int max = Math.max(c,Math.max(a,b));
                // System.out.println(max);

        }

}

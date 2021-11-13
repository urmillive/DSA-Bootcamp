package basics;

public class Scope_Demo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        {
            a = 100; //this will be update
            System.out.println(b); // use b in block scope
        }
    }

    static void random() {
        int num = 67;
        System.out.println(num);
    }
}

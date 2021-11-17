public class functionOverloading {
    public static void main(String[] args) {
        fun(44);
        fun("Urmil");
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
}

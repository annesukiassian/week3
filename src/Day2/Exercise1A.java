package Day2;

//Write a function add with 3 types of overloading.
public class Exercise1A {
    public static void main(String[] args) {
        add(7, 8);
        add(4, 6, 8);
    }

    public static void add(int a, int b) {
        System.out.println("first add " + (a + b));
    }

    public static void add(int a, int b, int c) {
        System.out.println("second add " + (a + b + c));
    }

}

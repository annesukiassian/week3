package Day2;

public class Exercise1B {
    public static void main(String[] args) {
        add(5, 7);
        add(5, 7.98F);
    }

    public static void add(int a, int b) {
        System.out.println("first add " + (a + b));
    }

    public static void add(int a, float b) {
        System.out.println("second add " + (a + b));
    }
}

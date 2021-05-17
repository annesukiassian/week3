package Day2;

public class Exercise1C {
    public static void main(String[] args) {
        add(6,67.5F);
        add(6.65F,8);
    }
    public static void add(int a, float b) {
        System.out.println("first add " + (a + b));
    }
    public static void add(float a, int b) {
        System.out.println("second add " + (a + b));
    }
}

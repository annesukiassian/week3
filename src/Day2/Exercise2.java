package Day2;
//Write 2 functions where first returns float second returns int,
//and they have the same parameters for input.
public class Exercise2 {
    public static void main(String[] args) {
        System.out.println("First method " + calculate(5, 6.8F));
        System.out.println("Second method " + calculate(6.5F, 2F));
    }

    public static int calculate(int a, float b) {
        return (int) (a + b);
    }

    public static float calculate(float a, float b) {
        return (a + b);
    }
}

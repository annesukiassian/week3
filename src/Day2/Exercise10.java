package Day2;

public class Exercise10 {
    public static void main(String[] args) {
        System.out.println(returnRemainder(49));
        System.out.println(returnRemainder(125, 3));
    }

    public static int returnRemainder(int a) {
        int sum = 0;
        int temp = a;
        while (a != 0) {
            sum += a % 10;
            a /= 10;
        }
        return temp % sum;
    }

    public static int returnRemainder(int a, int b) {
        int sum = 0;
        while (a > 0) {
            sum += a % 10;
            a = a / 10;
        }
        return sum / b;
    }

}

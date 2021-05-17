package Day4;

//Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2.
public class Exercise5 {
    public static void main(String[] args) {
        System.out.println(checkSeven(777));
    }

    public static int checkSeven(int n) {
        if (n == 0) {
            return 0;
        }
        if (n % 10 == 7) {
            return checkSeven(n / 10) + 1;
        }
        return checkSeven(n / 10);
    }
}

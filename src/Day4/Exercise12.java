package Day4;

//Given a string containing only decimal digits. Find and display the largest digit.
public class Exercise12 {
    public static void main(String[] args) {
        System.out.println(returnMax(19128));
    }

    public static int returnMax(int n) {
        if (n == 0) {
            return 0;
        }
        if (n % 10 > returnMax(n / 10)) {
            return n % 10;
        } else {
            return returnMax(n / 10);
        }

    }
}

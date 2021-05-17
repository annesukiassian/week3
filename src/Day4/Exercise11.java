package Day4;

//Write a function to determine if a number is prime or not.
//true (is Prime) , false (is not Prime)
public class Exercise11 {
    public static void main(String[] args) {
        System.out.println(checkPrime(7, 2));
    }

    public static boolean checkPrime(int n, int i) {
        if (n <= 1) {
            return false;
        }
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }

        return checkPrime(n, i + 1);

    }
}

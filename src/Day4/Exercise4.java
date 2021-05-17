package Day4;

//Given a non-negative int n, return the sum of its digits recursively
public class Exercise4 {
    public static void main(String[] args) {
        System.out.println(returnSum(235));
    }

    public static int returnSum(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + returnSum(n / 10);
    }

}

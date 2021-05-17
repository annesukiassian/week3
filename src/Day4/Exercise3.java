package Day4;

//Compute
//recursively (no loops or multiplication) the total number of blocks in
//such a triangle with the given number of rows.
public class Exercise3 {
    public static void main(String[] args) {
        System.out.println(calculateNumber(3));
    }

    public static int calculateNumber(int n) {
        if (n == 1) {
            return 1;
        }
        return n + calculateNumber(n - 1);

    }
}

package Day1;
//Write a function static int min(int a, int b, int c, int d) which finds the smallest of the given four numbers.
public class Exercise1 {
    public static void main(String[] args) {
        System.out.println(min(2,5,7,9));
    }

    public static int min(int a, int b, int c, int d) {
        int min = a;
        if (min > b && min < c && min < d) {
            min = b;
        } else if (min > c && min < d && min < b) {
            min = c;
        } else if (min > d && min < b && min < c) {
            min = d;
        }
        return min;
    }
}

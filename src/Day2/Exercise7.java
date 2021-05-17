package Day2;

//Write a max() function which
public class Exercise7 {
    public static void main(String[] args) {
        System.out.println(max(5, 8));
        System.out.println(max(78, 6, 103));
        System.out.println(max(43,6,87,4));
    }

    public static int max(int a, int b) {
        int max = a;
        if (max < b) {
            max = b;
        } else {
            max = a;
        }
        return max;
    }

    public static int max(int a, int b, int c) {
        int max = a;
        if (max < b && b > c) {
            max = b;
        } else if (max < c && b < c) {
            max = c;
        } else {
            max = a;
        }
        return max;
    }

    public static int max(int a, int b, int c, int d) {
        int max = a;
        if (max < b && c < b && d < b) {
            max = b;
        } else if (max < c && b < c && d < c) {
            max = c;
        } else if (max < d && b < d && c < d) {
            max = d;
        } else {
            max = a;
        }

        return max;
    }
}

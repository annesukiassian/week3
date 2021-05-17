package Day4;
//to find the sum of a given array.
public class Exercise1 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 9, 0};
        System.out.println(returnSum(arr, arr.length));
    }

    public static int returnSum(int[] array, int n) {
        if (n <= 0) {
            return 0;
        }
        return returnSum(array, n - 1) + array[n - 1];
    }

}

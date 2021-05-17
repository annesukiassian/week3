package Day2;

public class randomExercise3 {
    public static void main(String[] args) {
        int[][] matrix = {{4, 5, 8}, {6, 3, 5}};
        int[] arr = {6, -8, 7};
        System.out.println(executeArray(matrix));
        //System.out.println(executeArray(arr));
    }

    public static int[] executeArray(int[][] array) {
        int[][] matrix = {{4, 5, 8}, {6, 3, 5}};
        int n = matrix.length;
        int[] avg = new int[n];
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum = 0;
            for (int j = 0; j < matrix[i].length; i++) {
                sum += matrix[i][j];
            }
            avg[i] = sum / (array[i].length);
        }
        return avg;
    }

//    public static int[] executeArray(int[] array) {
//        int[] arr = {6, -8, 7};
//        //int[] negative;
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=-arr[i];
//        }
//        return arr;
//    }
}

package Day2;

public class Exercise4 {
    public static void main(String[] args) {
        int[] intArray = {5, 7, 8};
        float[] floatArray = {6.1F, 7.8F, 9};
        double[] doubleArray = {64.5, 7, 3.4};
        print(intArray);
        print(floatArray);
        print(doubleArray);
    }

    public static void print(int[] intArray) {
        System.out.print("[");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]);
            if (i < intArray.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]");

    }

    public static void print(float[] floatArray) {
        System.out.print("[");
        for (int i = 0; i < floatArray.length; i++) {
            System.out.print(floatArray[i]);
            if (i < floatArray.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]");

    }

    public static void print(double[] doubleArray) {
        System.out.print("[");
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.print(doubleArray[i]);
            if (i < doubleArray.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]");

    }
}

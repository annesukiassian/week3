package Day2;

public class randomExercise2 {
    public static void main(String[] args) {
        System.out.println(calculateDistance(3.5, 5));
        System.out.println(calculateDistance(2, 5, 8.7, 6));
    }

    public static double calculateDistance(double x, double y) {

        return Math.sqrt(Math.pow((0 - x), 2) + Math.pow((0 - y), 2));
    }

    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
}

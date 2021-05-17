package Day2;

//Write a distance() function which
//return distance from (0.0 , 0.0) to (a)
//distance(int x1 , int x2, int x3, int x4) where (x1, x2) are the coordinates of a
//distance(int, int)
//return the distance from a to be, if method distance get 4 int parameters
public class Exercise8 {
    public static void main(String[] args) {
        System.out.println(distance(3.5, 5));
        System.out.println(distance(3.5, 5, 8.7, 6));
    }

    public static double distance(double x, double y) {

        return Math.sqrt(Math.pow((0 - x), 2) + Math.pow((0 - y), 2));
    }

    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
}

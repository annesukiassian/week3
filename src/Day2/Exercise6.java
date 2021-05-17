package Day2;
//Write a square() method, which
//if get one  int parameter returns the square of circle
//if get one float parameter returns the square of square
//if get 2 parameters returns the square of rectangle
public class Exercise6 {
    public static void main(String[] args) {
        System.out.println("Area of circle " + square(6));
        System.out.println("Area of square " + square(6.8F));
        System.out.println("Area of rectangle " + square(8, 4));
    }

    public static double square(int a) {
        return (Math.PI * Math.pow(a, 2));
    }

    public static double square(float f) {
        return Math.pow(f, 2);
    }

    public static double square(int a, int b) {
        return (a * b);
    }
}

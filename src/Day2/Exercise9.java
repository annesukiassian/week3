package Day2;

//Write a fahrenheitCelsius() function
public class Exercise9 {
    public static void main(String[] args) {
        System.out.println(fahrenheitCelsius(32F,1));
        System.out.println(fahrenheitCelsius(19F,2));
        System.out.println(fahrenheitCelsius(1,5F));

    }

    public static double fahrenheitCelsius(float celsius, int choice) {
        if (choice == 1) {
            return (int) (celsius * 9 / 5 + 32);
        } else if (choice == 2) {
            return (celsius * 9 / 5 + 32);
        }

        return 0;
    }

    public static double fahrenheitCelsius(int choice, float fahrenheit) {
        return (32 * fahrenheit - 32) * 5 / 9;
    }

}

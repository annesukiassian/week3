package Day3;

//Write a function that counts duplicate characters from a given string.
public class Exercise12 {
    public static void main(String[] args) {
        System.out.println(countDubChars("abbc"));
    }

    public static int countDubChars(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            }
        }
        return count;
    }
}

package Day4;

//Given a string containing only English letters (uppercase and lowercase).
// Add the ‘*’ (asterisk) character between letters
public class Exercise14 {
    public static void main(String[] args) {
        String s = addAsterisk("asgdjs");
        System.out.println(s);
    }

    public static String addAsterisk(String s) {
        if (s.length() == 1) {
            return s.charAt(0)+"";
        }
        return s.charAt(0) + "*" + addAsterisk(s.substring(1));
    }
}

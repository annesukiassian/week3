package Day4;

//Given a string, return recursively a "cleaned" string where adjacent
//chars that are the same have been reduced to a single char.
public class Exercise10 {
    public static void main(String[] args) {
        System.out.println(cleanString("yyzzza"));
    }

    public static String cleanString(String s) {
        if (s.length() == 1) {
            return s;
        }
        if (s.charAt(0) == s.charAt(1)) {
            return s.charAt(0)+cleanString(s.substring(2));
        }
        return cleanString(s.substring(1));
    }
}

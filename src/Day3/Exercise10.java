package Day3;
//Write a program to verify a hex string.
public class Exercise10 {
    public static void main(String[] args) {
        System.out.println(checkHex("000111Fa10"));
        System.out.println(checkHex("10145eAbg7985"));
        System.out.println(checkHex("50544"));
        System.out.println(checkHex("-2454j1"));
        System.out.println(checkHex("-00011e1010"));
    }
    public static final String hexDigits = "0123456789ABCDEFabcdef";
    public static boolean checkHex(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (hexDigits.indexOf(str.charAt(i))==-1) {
                return false;
            }
        }
        return true;
    }
}

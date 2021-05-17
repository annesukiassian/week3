package Day3;

//Write a function called checkBinStr to verify a binary string.
public class Exercise9 {
    public static void main(String[] args) {
        System.out.println(checkBinStr("000111010"));
        System.out.println(checkBinStr("101457985"));
        System.out.println(checkBinStr("50544"));
        System.out.println(checkBinStr("-24541"));
        System.out.println(checkBinStr("-000111010"));
    }
    public static boolean checkBinStr(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '0' && str.charAt(i) != '1') {
                return false;
            }
        }
        return true;
    }
}

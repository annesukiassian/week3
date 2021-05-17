package Day3;
//Write a function called bin2Dec to convert an input binary string into its equivalent decimal number.
public class Exercise11 {
    public static void main(String[] args) {
        String str = "10101";
        if (checkBinStr(str)) {
            System.out.println(binaryToDecimal(str));
        } else {
            System.out.println("Invalid");
        }
    }

    public static boolean checkBinStr(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '0' && str.charAt(i) != '1') {
                return false;
            }
        }
        return true;
    }

    public static int binaryToDecimal(String a) {
        int decimalValue = 0;

        for (int i = a.length() - 1; i >= 0; i--) {
            char c = a.charAt(i);
            int intValue = Character.getNumericValue(c);
            if (intValue != 0) {
                decimalValue += intValue * Math.pow(2, (a.length() - i - 1));
            }
        }
        return decimalValue;
    }
}


package vivamethod;
import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        //String[] num = {"0", "a", ".", "-5E7", "2e+8", "2e2e"};
        String[] num = {"2e", "1a", "11e2.5", "-3", "+3", "+-3"};

        boolean[] isValid = new boolean[num.length]; // Array to store validity for each input
        
        for (int i = 0; i < num.length; i++) {
            isValid[i] = isValidNumber(num[i]);
        }
        
        System.out.print(Arrays.toString(isValid));
    }
    
    public static boolean isValidNumber(String num) {
        boolean hasDigit = false;
        boolean hasDecimal = false;
        boolean hasExponent=false;
        
        if (num == null || num.isEmpty()) {
            return false;
        }
        
        for (int j = 0; j < num.length(); j++) {
            char a = num.charAt(j);
            
            if (Character.isDigit(a)) {
                hasDigit = true;
            } else if (a == '.') {
                if (hasDecimal || hasExponent) {
                    return false; // Multiple decimals are not allowed
                }
                hasDecimal = true;
            } else if (a == 'e' || a == 'E') {
                if (!hasDigit || j == 0 || j == num.length() - 1 || hasExponent) {
                    return false; // Incorrect placement of 'e' or 'E'
                }
                // 'e' or 'E' can only appear once and must have digits before and after it
                hasExponent=true;
            } else if (a == '-' || a == '+') {
                if (j != 0 && (num.charAt(j - 1) != 'e' && num.charAt(j - 1) != 'E')) {
                    return false; // '-' or '+' can only appear at the start and also afer 'E' and 'e'
                }
            } else {
                return false; // Invalid character found
            }
        }
        
        return hasDigit; // Return true if at least one digit is present
    }
}

package viva2;

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        //prompt the user to input array
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter six values: ");
        String[]numbers=new String[6];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextLine();
        }
        StringArray(numbers);
        
        //Call the method to assess numeric validity
        boolean[]output=printValidity(numbers);
        
        //Displaying the output
        for (int i=0; i<output.length;i++){
            System.out.print(output[i]);
            if(i<output.length-1)
                System.out.print(", ");
        }
        System.out.println();
    }
    public static void StringArray(String[]num){
        //Print input
        System.out.print("Input: {");
        for (int i=0;i<num.length-1;i++){
            System.out.print("\""+num[i]+"\",");
        }
        System.out.println("\""+num[num.length-1]+"\"}");
        
    }
    
    public static boolean[]printValidity(String[]numbers){
        boolean[]result=new boolean[numbers.length];
        
        for (int i=0;i<numbers.length;i++){
            result[i]=isValidNumeric(numbers[i]);
        }

        return result;
    }
    
    public static boolean isValidNumeric(String value){
        boolean hasDigit = false;
        boolean hasDecimal = false;
        boolean hasExponent=false;
        
        if (value == null || value.isEmpty()) {
            return false;
        }
        
        for (int j = 0; j < value.length(); j++) {
            char a = value.charAt(j);
            
            if (Character.isDigit(a)) {
                hasDigit = true;
            } else if (a == '.') {
                if (hasDecimal || hasExponent) {
                    return false; // Multiple decimals are not allowed
                }
                hasDecimal = true;
            } else if (a == 'e' || a == 'E') {
                if (!hasDigit || j == 0 || j == value.length() - 1 || hasExponent) {
                    return false; // Incorrect placement of 'e' or 'E'
                }
                // 'e' or 'E' can only appear once and must have digits before and after it
                hasExponent=true;
            } else if (a == '-' || a == '+') {
                if (j != 0 && (value.charAt(j - 1) != 'e' && value.charAt(j - 1) != 'E')) {
                    return false; // '-' or '+' can only appear at the start and also afer 'E' and 'e'
                }
            } else {
                return false; // Invalid character found
            }
        }
        
        return hasDigit; // Return true if at least one digit is present
    }
}

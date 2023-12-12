/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vivamethod;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.print("Enter the password:");
        String msg=input.next();
        
        boolean valid=password(msg);
        System.out.println(valid);
    }
    public static boolean password(String a){
        if ((characterValid(a)) && capitalLetter(a) && smallLetter(a) && digitsValid(a) && SpecialCharacter(a)){
          return true;
    }
        return false;
    }
    public static boolean characterValid(String a){
        return a.length()>=8;
    }
    public static boolean capitalLetter(String a){
        int numberCapital=0;
        for(int i=0;i<a.length();i++){
            char n=a.charAt(i);
            if(n>='A' && n<='Z')
                numberCapital+=1;
        }
        if(numberCapital>=1)
            return true;
        else
            return false;
        
    }
    public static boolean smallLetter(String a){
        int numberSmall=0;
        for(int i=0;i<a.length();i++){
            char n=a.charAt(i);
            if(n>='A' && n<='Z')
                numberSmall+=1;
        }
        if(numberSmall>=1)
            return true;
        else
            return false;
        
    }
    public static boolean digitsValid(String a){
        int numberDigit=0;
        for(int i=0;i<a.length();i++){
            char n=a.charAt(i);
            if(n>='0' && n<='9')
                numberDigit+=1;
        }
        if(numberDigit>=3)
            return true;
        else
            return false;
        
    }
    public static boolean SpecialCharacter(String a){
        int numberSpecial=0;
        for(int i=0;i<a.length();i++){
            char n=a.charAt(i);
            if(n=='!' || n=='@' || n=='#' || n=='$' || n=='%' || n=='^' || n=='&' || n=='*' || n=='(' || n==')' || n=='-' || n=='+') 
                numberSpecial+=1;
        }
        if(numberSpecial==1)
            return true;
        else
            return false;
    }
}

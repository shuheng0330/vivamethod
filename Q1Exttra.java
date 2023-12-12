package vivamethod;
import java.util.Scanner;
public class Q1Exttra {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a password:");
        String password=input.next();
        boolean validpassword=IsPasswordValid(password);
        System.out.println(validpassword);
    }
    public static boolean IsPasswordValid(String p){
        int lower=0;
        int upper=0;
        int digit=0;
        int special=0;
        for (int i=0;i<p.length();i++){
            char a=p.charAt(i);
            if (Character.isUpperCase(a))
                upper++;
            if (Character.isLowerCase(a))
                lower++;
            if (Character.isDigit(a))
                digit++;
            if (a=='!'||a=='@'||a=='#'||a=='$'||a=='%'||a=='^'||a=='&'||a=='*'||a=='('||a==')'||a=='-'||a=='+')
                special++;  
        }
        if (p.length()>=8 && upper>=1 && lower>=1 && digit>=3 && special==1)
            return true;
        
        return false;
}}
    


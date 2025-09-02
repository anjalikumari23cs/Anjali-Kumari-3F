/*  Write a program to return all the characters in a 
string using the user-defined method,  
compare the result with the String built-in toCharArray() 
method, and display the result*/
import java.util.*;
import java.util.Arrays;
public class q3 {
    public static char[] extractCharsManually(String input) {
        char[] result = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            result[i] = input.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String text = sc.nextLine();
        char[] manualChars = extractCharsManually(text);
        char[] builtInChars = text.toCharArray();
        System.out.println("Manual char array: " + Arrays.toString(manualChars));
        System.out.println("Built-in char array: " + Arrays.toString(builtInChars));
        boolean areEqual = Arrays.equals(manualChars, builtInChars);
        System.out.println("Are both arrays equal? " + areEqual);
    }
}

package javaStringproblem;
import java.util.*;
public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder s=new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            s.append(str.charAt(i));
        }
        if(str.equals(s.toString())){
            System.out.println("Strings are Palindrome");
        }
        else{
            System.out.println("Strings are not palindrome");
        }
    }
}

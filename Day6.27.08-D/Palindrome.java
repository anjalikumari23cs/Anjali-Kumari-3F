// Palindrome Checker:
// ○ Write a program that checks if a given string is a palindrome (a word, phrase, or
// sequence that reads the same backward as forward).
// ○ Break the program into functions for input, checking the palindrome condition,
// and displaying the result.

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(ispalindrome(n));
    }
    public static boolean ispalindrome(int n){
        int temp=n;
        int res=0;
        while(temp>0){
            int r=temp%10;
            res=r+res*10;
            temp=temp/10;
        }
        if(n==res){
            return true;
        }
        return false;
    }
}

package Leetcode;
import java.util.*;
public class palindromenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int newnum=0;
        while(temp!=0){
            int rem=temp%10;
            newnum=newnum*10+rem;
            temp/=10;
        }
        if(newnum==n){
            System.out.println("Palindrome number");
        }
        else{
            System.out.println("Not Palindrome number");
        }
    }
}

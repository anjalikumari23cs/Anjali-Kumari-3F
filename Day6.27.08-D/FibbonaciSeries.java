// Fibonacci Sequence Generator:
// ○ Write a program that generates the Fibonacci sequence up to a specified number of terms entered by the user.
// ○ Organize the code by creating a function that calculates and prints the Fibonacci
// sequence.

import java.util.Scanner;
public class FibbonaciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1,c;
        for(int i=0;i<n;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(a+" ");
        }
    }
}

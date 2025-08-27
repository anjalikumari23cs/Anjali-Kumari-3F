// 2. Maximum of Three Numbers:
// ○ Write a program that takes three integer inputs from the user and finds the
// maximum of the three numbers.
// ○ Ensure your program follows best practices for organizing code into modular
// functions, such as separate functions for taking input and calculating the
// maximum value.

import java.util.Scanner;
public class MaximumofThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.println(a+" is greater than "+b+" and "+c);
        }
        else if(b>a && b>c){
            System.out.println(b+" is greater than "+a+" and "+c);
        }
        else{
            System.out.println(c+" is greater than "+a+" and "+b);
        }
    }
}

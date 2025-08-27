// 7. GCD and LCM Calculator:
// ○ Create a program that calculates the Greatest Common Divisor (GCD) and Least
// Common Multiple (LCM) of two numbers using functions.
// ○ Use separate functions for GCD and LCM calculations, showcasing how modular
// code works.

import java.util.Scanner;
public class GCD_LCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int mul=a*b;
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
    int gcd=Math.abs(a);
        System.out.println("GCD: "+gcd);
        System.out.println("LCM: "+mul/gcd);
    }
}

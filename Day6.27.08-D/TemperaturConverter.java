// 8. Temperature Converter:
// ○ Write a program that converts temperatures between Fahrenheit and Celsius. ○
// The program should have separate functions for converting from Fahrenheit to
// Celsius and from Celsius to Fahrenheit.

import java.util.*;
public class TemperaturConverter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Fahranite to celcius: "+ftoc(n));
        System.out.println("celcius to Fahranite: "+ctof(n));

    }
    public static int ftoc(int f){
        return (f - 32) * 5 / 9;
    }

    public static int ctof(int c){
        return (c * 9 / 5) + 32;
    }
}

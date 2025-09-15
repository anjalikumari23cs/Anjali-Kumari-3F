package javamethods;
import java.util.*;
public class level1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the principal,rate,time for simple interest:");
        int p=sc.nextInt();
        int r=sc.nextInt();
        int t=sc.nextInt();
        si(p,r,t);
        System.out.println("Enter the number of students:");
        int n=sc.nextInt();
        numberofhandshake(n);

        System.out.println("q3.enter the three sides of triangle:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        calculateround(a, b, c);
    }
    // create a method to calculate simple interes
    public static void si(int p,int r,int t){
        int si=(p*r*t)/100;
        System.out.println("Simple interest is:"+si);
    }

    // Create a program to find the maximum number of handshakes among students.
    public static void numberofhandshake(int n){
        System.out.println("Number of handshakes:"+(n*(n-1))/2);
    }

    // create method to calulate number of rounds coveres in distance of 5km
    public static void calculateround(int a,int b,int c){
        double perimeter=a+b+c;
        double disatancetocover=5000;
        System.out.println("distance covered:"+disatancetocover/perimeter);
    }

    public static boolean springmonth(int month,int day){
        if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)){
            return true;
        }
        return false;
    }

}

import java.util.*;
public class basiccal {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter first number: ");
        int a=sc.nextInt();
        System.out.println("Enter second number: ");
        int b=sc.nextInt();
        int add=a+b;
        int sub=a-b;
        int div=a/b;
        int mul=a*b;
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers "+a+" and "+b+" is "+add+","+sub+","+mul+" and "+div);

    }
}

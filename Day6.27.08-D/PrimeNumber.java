// Prime Number Checker:
// ○ Create a program that checks whether a given number is a prime number. ○
// The program should use a separate function to perform the prime check and
// return the result.

import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isPrime(n)){
            System.out.println("number is prime");
        }
        else{
            System.out.println("Not prime");
        }
    }
    public static boolean isPrime(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count>2){
            return false;
        }
        return true;
    }
}
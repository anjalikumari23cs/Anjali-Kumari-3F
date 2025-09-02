package Leetcode;

import java.util.*;
public class HappyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        while(temp>0){
            int rem=temp/10;
            temp=temp/10;
            sum+=rem*rem;
        }
        System.out.println(sum);
        if(sum==1){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}

package javaStringproblem;
import java.util.*;
public class findlongestword {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String arr[]=str.split("\\s+");
        String res="";
        for(String i:arr){
            if(i.length()>res.length()){
                res=i;
            }
        }
        System.out.println(res);
    }
}

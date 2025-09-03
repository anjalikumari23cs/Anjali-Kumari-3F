package Leetcode;
import java.util.*;
public class validanagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        if(s.length()!=t.length()){
            System.out.println("Not anagram");
        }
        char s1[]=s.toCharArray();
        char t1[]=t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        System.out.println(Arrays.equals(s1,t1));
    }
   
}

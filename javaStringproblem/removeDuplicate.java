package javaStringproblem;
import java.util.*;
public class removeDuplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Set<Character> set=new HashSet<>();
        StringBuilder s=new StringBuilder();
        for(char i:str.toCharArray()){
            if(!set.contains(i)){
                set.add(i);
                s.append(i);
            }
        }
        System.out.println(s.toString());
    }
}

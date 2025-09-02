// String level1
// Write a program to compare two strings using the charAt() method 
// and check the result with the built-in String equals() method
import java.util.*;
public class q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s2=sc.nextLine();
        boolean isequal=true;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s2.charAt(i)){
                isequal=false;
            }
        }
        if(isequal){
            System.out.println("string equale using char at");
        }
        else{
            System.out.println("not equale");
        }
        System.out.println(s.equals(s2));
    }
}
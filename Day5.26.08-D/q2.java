/* Write a program to create a substring from a String 
 using the charAt() method. Also, use the String built-in 
 method substring() to find the substring of the text. 
Finally Compare the the two strings and display the results*/
import java.util.*;
public class q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(s.substring(0,4));
    }
}

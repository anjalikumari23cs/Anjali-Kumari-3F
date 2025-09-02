package javaStringproblem;
import java.util.*;
public class countvowelsandconsonents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int vowelcount = 0;
        int conscount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelcount++;
            } else if (Character.isLetter(ch)) {
                conscount++;
            }
        }
        System.out.println("vowels count:" + vowelcount);
        System.out.println("consonent count:" + conscount);
    }
}

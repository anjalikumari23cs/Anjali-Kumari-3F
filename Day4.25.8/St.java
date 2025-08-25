import java.util.*;
public class St {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1= sc.nextLine();
        String s2=sc.nextLine();
        // Case Sensitive
        // if(s1.equals(s2)){
        //     System.out.println("equale string");
        // }
        // else{
        //     System.out.println("Not Equal");
        // }

        // Case Insensitive
        if(s1.toUpperCase().equals(s2.toUpperCase())){
            System.out.println("equale string");
        }
        else{
            System.out.println("Not Equal");
        }

    }
}

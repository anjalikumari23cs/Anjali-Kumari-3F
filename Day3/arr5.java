//Q5 Create a program to find the multiplication table of a
//  number entered by the user from 6 to 9 and display the result
import java.util.*;
public class arr5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<6||n>9){
            System.out.println("Invalid input");
            return;
        }
        int mul[]=new int[10];
        for(int i=1;i<=10;i++){
            mul[i-1]=n*i;
        }
        for(int i=1;i<=10;i++){
            System.out.println(i+" * "+n+" = "+mul[i-1]);
        }
    }
}

import java.util.*;
public class areaoftri {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter height:");
        int h=sc.nextInt();
        System.out.println("enter base: ");
        int b=sc.nextInt();
        int area=(h*b)/2;
        double areain = area/2.54;
        System.out.println("Area in inches is:"+areain);
    }
}

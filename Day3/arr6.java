// Create a program to find the mean height of players present in a football team.
import java.util.Scanner;
public class arr6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of plyars: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter height of "+(i+1)+" player");
            arr[i]=sc.nextInt();
        }
        double sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println("Total sum of height's are "+sum);
        double mean=sum/n;
        System.out.println("Mean height of players is: "+mean);

    }
}

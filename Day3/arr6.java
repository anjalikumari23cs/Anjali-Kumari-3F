// Create a program to find the mean height of players present in a football team.
import java.util.Scanner;
public class arr6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[11];
        for(int i=0;i<11;i++){
            System.out.print("Enter height of "+(i+1)+" player");
            arr[i]=sc.nextInt();
        }
        double sum=0;
        for(int i=0;i<11;i++){
            sum+=arr[i];
        }
        System.out.println("Total sum of height's are "+sum);
        double mean=sum/11;
        System.out.printf("Mean height of players is: %.2f%n",mean);

    }
}

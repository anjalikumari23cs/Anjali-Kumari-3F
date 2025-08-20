import java.util.*;
// Q4 Write a program to store multiple values in an array up to 
// a maximum of 10 or until the user enters a 0 or a negative number. 
// Show all the numbers as well as the sum of all numbers 

public class arr4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double arr[]=new double[10];
        double sum=0;
        int index=0;
        while(true){
            System.out.print("Enter 0 aur negative to break the loop");
            double value=sc.nextInt();
            if(value<=0 || index==10){
                break;
            }
            arr[index]=value;
            index++;

        }
        for(int i=0;i<index;i++){
            System.out.println("arr index "+i+" value "+arr[i]);
            sum+=arr[i];
        }
        System.out.println("Totla sum "+sum);
    }
}

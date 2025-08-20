import java.util.*;
//Q1 Write a program to take user input for the age of all 10 students
//  in a class and check whether the student can vote depending on his/her age 
// is greater or equal to 18.
public class Arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        for(int i=0;i<10;i++){
            System.out.print("Enter the age of "+i+" student");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++){
            if(arr[i]>=18){
                System.out.println("Student with age "+arr[i]+" can vote");
            }
            else{
                System.out.println("Student with age "+arr[i]+" can't vote");
            }
        }
    }
}

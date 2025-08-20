import java.util.*;
public class arr7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int even[]=new int[(n/2)+1];
        int odd[]=new int[(n/2)+1];
        int eindex=0;
        int oindex=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                even[eindex++]=i;
            }
            else{
                odd[oindex++]=i;
            }
        }
        System.out.print("even array: ");
        for(int i=0;i<eindex;i++){
            System.out.print(even[i]+" ");
        }
        System.out.print("\nodd array: ");
        for(int i=0;i<oindex;i++){
            System.out.print(odd[i]+" ");
        }
    }
}

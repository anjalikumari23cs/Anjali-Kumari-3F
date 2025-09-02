package Leetcode;

public class findindexoffirstoccureance {
    public static void main(String[] args) {
        String haystack="leetbuts";
        String needle="leetco";
        int indx=haystack.indexOf(needle);
        if(indx!=-1){
            System.out.println("found at "+indx);
        }
        else{
            System.out.println(-1);
        }
    }
}

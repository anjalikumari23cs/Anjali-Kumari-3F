package Leetcode;

public class lengthoflastword {
    public static void main(String[] args) {
        String str="Hello World";
        String res[]=str.split(" ");
        String last=res[res.length-1];
        int length=0;
        for(int i=0;i<last.length();i++){
            length++;
        }
        System.out.println(length);
    }

}
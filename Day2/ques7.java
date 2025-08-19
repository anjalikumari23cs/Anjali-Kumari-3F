package Day2;


public class ques7 {
    final int n=0;
    void newval(int newnum){
        this.n=newnum;   
        // ques7.java:7: error: cannot assign a value to final variable n
    }
    void display(){
        System.out.println(n);
    }
    public static void main(String[] args) {
        ques7 q=new ques7();
        q.newval(10);
        q.display();
    }
}

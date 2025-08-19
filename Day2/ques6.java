package Day2;

 class Demo{
    int number;  //instance var
    void setnumber(int number){
        //local var
        this.number=number;
    }
    void display(){
        System.out.println(number);
    }
 }
public class ques6 {
    public static void main(String[] args) {
        Demo d=new Demo();
        d.setnumber(50);
        d.display();
    }
}

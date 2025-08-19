package Day2;
class Mycar{
    static int numberofcar=0;
    Mycar(){
        numberofcar++;
    }
     
    void change(int newcount){
        numberofcar=newcount;
    }
    void display(){
        System.out.println("total cars: "+numberofcar);
    }
}
public class ques5 {
    public static void main(String[] args) {
        Mycar c1=new Mycar();
        c1.change(10);
        c1.display();
    }
}

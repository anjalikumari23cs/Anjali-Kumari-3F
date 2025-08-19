package Day2;

class User{
    final int userId;
    User(int id){
        this.userId=id;
    }
    void display(){
        System.out.println("userid"+userId);
    }
}
public class ques12 {

    public static void main(String[] args) {
        User u=new User(101);
        u.display();
    }
}

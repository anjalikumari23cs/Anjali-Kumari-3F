package Day2;

class Account {
    String accountHolder="Anjali";   
    double balance=1000;         
    void display() {
        System.out.println( accountHolder);
        System.out.println( balance);
    }
}

public class ques9{
    public static void main(String[] args) {
    
        Account acc = new Account();
        acc.display();
    }
}

class Car{
    String model;
    int year;
    Car(String model,int year){
        this.model=model;
        this.year=year;
    }
    void display(){
        System.out.println("model:"+model+"year: "+year);
    }
}
public class versions{
    public static void main(String[] args) {
        Car c1=new Car("Honda Civic",2022);
        Car c2=new Car("Apache",2021);
        c1.display();
        c2.display();
    }
}
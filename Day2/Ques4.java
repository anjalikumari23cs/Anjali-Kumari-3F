package Day2;

class Student{
    String name;
    int marks;
    Student(String name, int marks){
        this.name=name;
        this.marks=marks;
    }
    void display(){
        System.out.println("Name: "+name+" Marks: "+marks);
    }
}
public class Ques4 {
    public static void main(String[] args) {
        Student s1=new Student("Anjali",77);
        s1.display();
    }

}

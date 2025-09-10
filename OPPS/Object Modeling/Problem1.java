import java.util.*;
class Book{
    private String title;
    private String author;
    public Book(String title,String author){
        this.title=title;
        this.author=author;
    }
    public void display(){
        System.out.println("Title "+title+"Author "+author);
    }
}
class library{
    private String name;
    private ArrayList<Book>books;
    public library(String name){
        this.name=name;
        this.books=new ArrayList<>();
    }
    public void addBook(Book book) {
        books.add(book);
    }
    public void showLibraryBooks(){
        System.out.println("Library: " + name);
        for (Book book : books) {
            book.display();
        }
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Book b1 = new Book("The Alchemist", "Paulo Coelho");
        Book b2 = new Book("Clean Code", "Robert C. Martin");
        Book b3 = new Book("Atomic Habits", "James Clear");
        library lib1 = new library("City Library");
        library lib2 = new library("University Library");
        lib1.addBook(b1);
        lib1.addBook(b2);
        lib2.addBook(b2); 
        lib2.addBook(b3);
        lib1.showLibraryBooks();
        lib2.showLibraryBooks();
    }
}

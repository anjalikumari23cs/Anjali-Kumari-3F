// Write a program to demonstrate IllegalArgumentException
public class q6{
    public static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative: " + age);
        }
        System.out.println("Age is set to: " + age);
    }
    public static void main(String[] args) {
        System.out.println("=== Demonstrating IllegalArgumentException ===");
        setAge(25);
        try {
            setAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        }
    }
}

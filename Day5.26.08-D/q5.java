// Write a program to demonstrate StringIndexOutOfBoundsException
public class q5{
    public static void generateException() {
        String text = "hello";
        System.out.println("Character at index 10: " + text.charAt(10));
    }
    public static void handleException() {
        String text = "hello";
        try {
            System.out.println("Character at index 10: " + text.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }

    public static void main(String[] args) {
        System.out.println("=== Generating Exception ===");
        try {
            generateException();
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
        System.out.println("\n=== Handling Exception Gracefully ===");
        handleException();
    }
}

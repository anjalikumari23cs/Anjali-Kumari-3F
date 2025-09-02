// Write a program to demonstrate NullPointerException. 
public class q4{
    public static void generateException() {
        String text = null;
        System.out.println("Length of text: " + text.length());
    }
    public static void handleException() {
        String text = null;
        try {
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: text is null");
        }
    }
    public static void main(String[] args) {
        System.out.println("=== Generating Exception ===");
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
        System.out.println("\n=== Handling Exception Gracefully ===");
        handleException();
    }
}
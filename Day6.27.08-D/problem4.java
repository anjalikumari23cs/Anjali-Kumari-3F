// 4. Problem 4: Date Comparison Write a program that:
// ➢ Takes two date inputs and compares them to check if the first date is before, after,
// or the same as the second date.
// Hint: Use isBefore(), isAfter(), and isEqual() methods from the LocalDate class.

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class problem4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        // Get first date input
        System.out.print("Enter the first date (dd-MM-yyyy): ");
        String firstInput = sc.nextLine();
        LocalDate firstDate = LocalDate.parse(firstInput, formatter);

        // Get second date input
        System.out.print("Enter the second date (dd-MM-yyyy): ");
        String secondInput = sc.nextLine();
        LocalDate secondDate = LocalDate.parse(secondInput, formatter);

        // Compare the dates
        if (firstDate.isBefore(secondDate)) {
            System.out.println("The first date is before the second date.");
        } else if (firstDate.isAfter(secondDate)) {
            System.out.println("The first date is after the second date.");
        } else if (firstDate.isEqual(secondDate)) {
            System.out.println("Both dates are the same.");
        } else {
            System.out.println("Unexpected comparison result.");
        }
    }
}

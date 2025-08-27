// Problem 2: Date Arithmetic Create a program that:
// ➢ Takes a date input and adds 7 days, 1 month, and 2 years to it.
// ➢ Then subtracts 3 weeks from the result.
// Hint: Use LocalDate.plusDays(), plusMonths(), plusYears(), and
// minusWeeks() methods.

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.Scanner;
public class problem2{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        // Prompt user for input date
        System.out.print("Enter a date (DD-MM-YYYY): ");
        String input = sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // Parse the input date using the custom formatter
        LocalDate date = LocalDate.parse(input, formatter);


        // Add 7 days, 1 month, and 2 years
        LocalDate updatedDate = date.plusDays(7).plusMonths(1).plusYears(2);
        System.out.println("After adding 7 days, 1 month, and 2 years: " + updatedDate);

        // Subtract 3 weeks
        LocalDate finalDate = updatedDate.minusWeeks(3);
        System.out.println("After subtracting 3 weeks: " + finalDate);   
    }   
}

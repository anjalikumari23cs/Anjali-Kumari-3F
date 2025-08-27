
// 1. Number Guessing Game:
// ○ Write a Java program where the user thinks of a number between 1 and 100, and
// the computer tries to guess the number by generating random guesses.
// ○ The user provides feedback by indicating whether the guess is high, low, or
// correct. The program should be modular, with different functions for generating
// guesses, receiving user feedback, and determining the next guess.

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        System.out.println("Think of a number between 1 and 100, and I will try to guess it!");

        int lowerBound = 1;
        int upperBound = 100;
        boolean guessedCorrectly = false;

        while (!guessedCorrectly && lowerBound <= upperBound) {
            int guess = generateGuess(lowerBound, upperBound);
            System.out.println("Is your number " + guess + "?");
            String feedback = getUserFeedback();

            switch (feedback.toLowerCase()) {
                case "low":
                    lowerBound = guess + 1;
                    break;
                case "high":
                    upperBound = guess - 1;
                    break;
                case "correct":
                    System.out.println("Yay! I guessed your number.");
                    guessedCorrectly = true;
                    break;
                default:
                    System.out.println("Invalid input. Please type 'low', 'high', or 'correct'.");
            }
        }

        if (!guessedCorrectly) {
            System.out.println("Hmm... something went wrong. Did you change your number?");
        }
    }

    // Generates a random guess within bounds
    public static int generateGuess(int lower, int upper) {
        return random.nextInt(upper - lower + 1) + lower;
    }

    // Gets feedback from the user
    public static String getUserFeedback() {
        System.out.print("Enter feedback (low/high/correct): ");
        return sc.nextLine();
    }
}
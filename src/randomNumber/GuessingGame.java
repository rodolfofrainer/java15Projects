package randomNumber;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        int targetNumber = (int) (Math.random() * 100);
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;

        while (true) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();

            if (userGuess > targetNumber) {
                System.out.print("Too high. Try again: ");
            } else if (userGuess < targetNumber) {
                System.out.print("Too low. Try again: ");
            } else {
                System.out.println("You win. The number was " + targetNumber);
                break;
            }

            attempts++;
            if (attempts == 10) {
                System.out.println("You lose. The number was " + targetNumber);
                break;
            }
        }
    }
}
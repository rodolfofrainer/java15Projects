package guessingGame;

import java.util.Random;
import java.util.Scanner;

public class guessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int bound = 20;
        int randomNumber = random.nextInt(bound);
        System.out.println("DEBUG: "+randomNumber);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose a number between 0 and "+bound+": ");
        int playerGuess = scanner.nextInt();

        while(playerGuess != randomNumber){
            if (playerGuess>randomNumber){
                System.out.println("Too high! Try a lower number.");
                System.out.print("Choose a number between 0 and "+bound+": ");
                playerGuess = scanner.nextInt();
            }
            else{
                System.out.println("Too low! Try a higher number.");
                System.out.print("Choose a number between 0 and "+bound+": ");
                playerGuess = scanner.nextInt();
            }
        }
        System.out.println("Correct! the number was "+randomNumber);
    }
}

package AtmSimulator;

import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        System.out.println("Welcome to the ATM Simulator!");
        System.out.println("1. Check balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Exit");
        System.out.print("Action to be performed: ");
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        Atm atm = new Atm(0);
        while(userChoice != 4) {
            atm.execute(userChoice);
            System.out.print("Action to be performed: ");
            userChoice = scanner.nextInt();
        }
        System.out.println("Thank you for using the ATM Simulator!");
    }
}

package AtmSimulator;

import java.util.Scanner;

public class Atm {
    float total;



    public void execute(int userChoice) {
        switch (userChoice) {
            case 1:
                System.out.println("Checking balance");
                System.out.println("Your total balance is: " + this.total);
                break;
            case 2:
                System.out.println("Your total balance is: " + this.total);
                userWithdraw();
                break;
            case 3:
                userDeposit();
                break;
            case 4:
                System.out.println("Exiting");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }

    public Atm(float total) {
        this.total = total;
    }

    private void userDeposit(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("How much would you like to deposit? ");
        this.total += scanner.nextFloat();
    }

    private void userWithdraw(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("How much would you like to withdraw:");
        float toBeWithdrawn = scanner.nextFloat();
        if(this.total < toBeWithdrawn) {
            System.out.println("Insufficient balance");
            return;
        }
        this.total -= toBeWithdrawn;
        System.out.println("Your total balance is: " + this.total);
    }


}

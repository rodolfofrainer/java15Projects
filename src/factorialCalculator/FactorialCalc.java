package factorialCalculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FactorialCalc {
    public static void main(String[] args) {
        System.out.print("Enter a number to factorialize: ");
        Scanner scanner = new Scanner(System.in);
        try {
            int number = scanner.nextInt();
            int result = factorial(number);
            System.out.println(result);
        } catch (InputMismatchException e){
            System.out.println("That's not a valid number.");
        }
    }

    public static int factorial(int number){
        if(number>1){
            return number*factorial(number-1);
        }
        else{
            return 1;
        }
    }
}

package isItPrime;

import java.util.Scanner;

public class isItPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime: ");
        int number = scanner.nextInt();
        System.out.println(primeCheck(number) ? number +" is a prime number." : number +" is not a prime number.");
    }

    private static boolean primeCheck(int number) {
        if (number<=1){
            return false;
        }
        for (int i=2; i < Math.sqrt(number); i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
}

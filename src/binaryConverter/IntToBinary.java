package binaryConverter;

import java.util.Scanner;

public class IntToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to convert to binary: ");
        int number = scanner.nextInt();
        String binary = Integer.toBinaryString(number);
        System.out.println("The binary representation of " + number + " is: " + binary);
    }
}

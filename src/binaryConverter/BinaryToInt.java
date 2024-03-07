package binaryConverter;

import java.util.Scanner;

public class BinaryToInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryString = scanner.nextLine();

        int decimal = binaryToDecimal(binaryString);

        System.out.println("The decimal representation of " + binaryString + " is: " + decimal);
    }

    public static int binaryToDecimal(String binaryString) {
        return Integer.parseInt(binaryString, 2);
    }
}

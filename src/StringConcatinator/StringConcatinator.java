package StringConcatinator;

import java.util.Scanner;

public class StringConcatinator {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a first String:");
        String first_string = scanner.nextLine().trim();
        System.out.print("Enter a second String:");
        String second_string = scanner.nextLine().trim();

        System.out.println("The concatenated string is: " + first_string + second_string);
        System.out.println("The first word in reverse is: "+ new StringBuilder(first_string).reverse());
        System.out.println("The second word in reverse is: "+ new StringBuilder(second_string).reverse());
        System.out.println("**************************************************");
        Thread.sleep(2000);
        System.out.println("The length of the first string is: "+ first_string.length());
        System.out.println("The length of the second string is: "+ second_string.length());
        System.out.println("**************************************************");
        Thread.sleep(2000);
        System.out.println("The first string in uppercase is: "+ first_string.toUpperCase());
        System.out.println("The second string in uppercase is: "+ second_string.toUpperCase());
        System.out.println("**************************************************");
        Thread.sleep(2000);
        System.out.println("The first string in lowercase is: "+ first_string.toLowerCase());
        System.out.println("The second string in lowercase is: "+ second_string.toLowerCase());
        System.out.println("**************************************************");
        Thread.sleep(2000);
    }
}

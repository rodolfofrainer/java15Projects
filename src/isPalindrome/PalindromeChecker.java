package isPalindrome;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        System.out.print("Enter a word to check if it is a palindrome: ");
        Scanner scanner = new Scanner(System.in);
        String palindrome_check = scanner.nextLine();
        boolean result = isPalindrome(palindrome_check);
        if (result) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    private static boolean isPalindrome(String palindromeCheck) {
        return palindromeCheck.contentEquals(new StringBuilder(palindromeCheck).reverse());
    }
}

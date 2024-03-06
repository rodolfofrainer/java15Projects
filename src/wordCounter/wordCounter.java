package wordCounter;

import java.util.Scanner;

public class wordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Sentence: ");
        String sentence = scanner.nextLine();
        sentence = sentence.trim();
        String[] words = sentence.split(" ");
        String[] result = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].trim();
            if(!words[i].isEmpty()) {
                result[i] = words[i];
            }
        }
        System.out.println("Total words: " + result.length);
    }
}

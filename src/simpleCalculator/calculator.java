package simpleCalculator;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First Value: ");
        String temp_value1 = scanner.nextLine();
        float first_value = Float.parseFloat(temp_value1);

        System.out.print("Enter the operation (+, -, *, /):");
        String operation = scanner.nextLine();

        System.out.print("Second Value: ");
        String temp_value2 = scanner.nextLine();
        float second_value = Float.parseFloat(temp_value2);

        float result = switch (operation) {
            case "+" -> first_value + second_value;
            case "-" -> first_value - second_value;
            case "*" -> first_value * second_value;
            case "/" -> first_value / second_value;
            default -> 0.0f;
        };
        System.out.print(temp_value1+" "+operation+" "+temp_value2+" : "+result);
    }
}

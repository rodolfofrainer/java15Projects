package factCalc;

import java.util.Scanner;

public class factCalc {
    public static int Factorize(int iterations){
        int factorial = 1;

        for(int i=iterations; i> 1; i--){
            factorial*=i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Factorial for: ");
        int iterations = scanner.nextInt();
        System.out.println(Factorize(iterations));
    }
}

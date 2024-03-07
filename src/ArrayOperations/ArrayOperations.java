package ArrayOperations;

import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5,9,5,2,1,4,8,4,3,5};
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        int sum = Arrays.stream(intArray).sum();
        System.out.println("Sum of values in array is: " + sum);

        int max = Arrays.stream(intArray).max().getAsInt();
        System.out.println("Max value in array is: " + max);

        int min= Arrays.stream(intArray).min().getAsInt();
        System.out.println("Max value in array is: " + min);
    }
}

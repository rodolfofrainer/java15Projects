package fibonacci;

import java.util.ArrayList;
import java.util.List;

public class fibonacci {

    public static void Fibonacci(int interations){
        // returns a list of all numbers of the fibonacci number until X position
        //Input -> Integer
        // Output -> Void
        List<Integer> fibonacciList = new ArrayList<>();
        fibonacciList.add(0);
        fibonacciList.add(1);

        for(int i=0; i<interations;i++){
            fibonacciList.add(fibonacciList.get(i) + fibonacciList.get(i+1));
        }
        for(int i=0; i<fibonacciList.size(); i++){
            System.out.print(fibonacciList.get(i));
            if (i<fibonacciList.size()-1){
                System.out.print(", ");
            }
        }
    }

    public static Integer specificFibonacciPos(int x){
        // Returns the number in the specific position of the fibonacci number
        //Input -> Integer
        //Output -> Integer
        if (x<=2){
            return 1;
        }
        return specificFibonacciPos(x-1) + specificFibonacciPos(x-2);
    }
    public static void main(String[] args) {
//        Fibonacci(20);
        System.out.println(specificFibonacciPos(17));
    }
}

package fibonacci;

import java.util.ArrayList;
import java.util.List;

public class fibonacci {

    public static void Fibonacci(int interations){
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
    public static void main(String[] args) {
        Fibonacci(20);
    }
}

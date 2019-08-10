package PrimeNumbers;

import java.util.List;

public class PrainMain {
    public static void main(String[] args) {
        PrimeCalculator primeCalculator = new PrimeCalculator();
        System.out.println(primeCalculator.isPrime(18));
        List<Integer> list = primeCalculator.getPrimeNumbers(99);
        for(int i:list){
            System.out.print(i + " ");
        }
    }
}

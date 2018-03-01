/*
This script outputs the prime factors of an integer. It does not print out anything for the number 1. 
*/

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static List<Integer> primeFactors(int number) {
        int n = number;
        List<Integer> factors = new ArrayList<Integer>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        return factors;
    }

    //Here the script is tested for some random integers
    public static void main(String[] args) {
        System.out.println("Primefactors of 1");
        for (Integer integer : primeFactors(1)) {
            System.out.println(integer);
        }
        System.out.println("Primefactors of 5");
        for (Integer integer : primeFactors(5)) {
            System.out.println(integer);
        }
        System.out.println("Primefactors of 21");
        for (Integer integer : primeFactors(21)) {
            System.out.println(integer);
        }
    }
}





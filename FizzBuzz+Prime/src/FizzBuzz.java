/* This script finds a number prints 100 integers replacing numbers which can be divided by 5 and 3 with "FizzBuzz",
replaces numbers which can be divided by 5 with Buzz and number which can be divided by 3 with Fizz.
*/

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(String.valueOf(i));
            }
        }
    }
}
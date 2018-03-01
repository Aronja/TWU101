//This script creates a Diamond, which is centered by the given number
//inherit code from IsocelesTriangle class !!!!

public class Diamond_name {
    public static void main(String[] args) {
        int number = 2;
        //creates upwards facing triangle
        for (int i = 1; i < number * 2; i += 2) {
            for (int j = 1; j < (number - (i / 2)); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.println("Azi");

        //added reverse function
        for (int i = (number) * 2; i > 1; i -= 2) {
            for (int j = (number - (i / 2)); j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = i; j > 1; j--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
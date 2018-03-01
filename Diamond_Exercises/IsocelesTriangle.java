//creates IsocelesTriangle, the number specifies the center of the triangle.

public class IsocelesTriangle {
    public static void main(String[] args) {
        int number = 3;
        for (int i = 1; i < number * 2; i += 2) {
            for (int j = 1; j < (number - (i / 2)); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

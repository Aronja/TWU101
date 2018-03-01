/* This script creates asterisks in the shape of lines or as triangles
I inserted some empty lines for readability of the output.
 */

public class Easiestexerciseever {
    public static void main(String[] args) {
        //Easiest exercise ever
        //draw one asterisk
        System.out.println("*");
        //draw horizontal line of asterisk
        System.out.println();
        for (int i = 1; i <= 8; i++) {
            System.out.print("*");
        }

        System.out.println();
        System.out.println();

        //draw vertical line of asterisks
        for (int i = 1; i <= 3; i++) {
            System.out.println("*");
        }
        System.out.println();
        //create right triangle of asterisks
        for(int i=0;i<3;i++) {
            for(int k=0;k<=i;k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}



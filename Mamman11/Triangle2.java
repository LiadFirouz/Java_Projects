/**
 * The Triangle2 class check the numbers and prints
 * if they are represent a triangle or not, and if so which type.
 *
 * @author Liad Firouz
 * @version 12-11-2022
 */
import java.util.Scanner;
public class Triangle2
{
    /**
     * Gets three numbers from the user,
     * check their legality and if represent a triangle,
     * in case they are - checks the triangle type and prints appropriate notice
     * otherwise - prints appropriate notice
     */
    public static void main(String[]args)
    {
        final int EXPONENT = 2;

        //Gets three lengths from the user
        Scanner scan = new Scanner(System.in);
        System.out.println("This program checks if the lengths represent a triangle and each type.");
        System.out.println("Please enter the three lengths:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        //Checks if the lengths fulfills the conditions of triangle
        if ((a + b > c) && (a + c > b) && (c + b > a))
        {
            //Checks in each if different triangle type
            if (a == b && b == c)
                System.out.println("The numbers: " + a + ", " + b + " and " + c +
                        " represent an equilateral triangle");

            else if (a == b || a == c || b == c)
                System.out.println("The numbers: " + a + ", " + b + " and " + c +
                        " represent an isosceles triangle");

            //Using Pythagoras formula: (a * a) + (b * b) = (c * c)
            else if ((Math.pow(a, EXPONENT) + Math.pow(b, EXPONENT) == Math.pow(c, EXPONENT)) ||
                    (Math.pow(a, EXPONENT) + Math.pow(c, EXPONENT) == Math.pow(b, EXPONENT)) ||
                    (Math.pow(c, EXPONENT) + Math.pow(b, EXPONENT) == Math.pow(a, EXPONENT)))
                System.out.println("The numbers: " + a + ", " + b + " and " + c +
                        " represent a right-angle triangle");

            else
                System.out.println("The numbers: " + a + ", " + b + " and " + c +
                        " represent a common triangle");
        } //if

        //Cannot represent a triangle
        else
            System.out.println("The numbers: " + a + ", " + b + " and " + c +
                    " cannot represent a triangle");

    } //main method
} //Triangle2 class

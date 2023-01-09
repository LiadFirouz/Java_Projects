/**
 * This class prints and calculate the area and perimeter of a given triangle.
 *
 * @author (Liad Firouz)
 * @version 12-11-2022
 */
import java.util.Scanner;
public class Triangle1
{
    /**
     * Gets three length of triangle from the user,
     * calculates the perimeter and area using Heron formula: √(s(s-a)(s-b)(s-c)),
     * s = half perimeter = (a + b + c) * 0.5.
     * in case of triangle - prints which type.
     * otherwise - prints appropriate notice.
     */
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("This program calculates the area" +
                "and the perimeter of a given triangle.");
        System.out.println("Please enter the three lengths " +
                "of the triangle's sides");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        //Calculates the perimeter and area using Heron formula: √(s(s-a)(s-b)(s-c))
        //s = half perimeter = (a + b + c) * 0.5
        int perimeter = a + b + c;
        double halfPerimeter = perimeter * 0.5;
        double area = Math.sqrt(halfPerimeter * (halfPerimeter-a) * (halfPerimeter-b) * (halfPerimeter-c));

        System.out.println("The lengths of the triangle sides are: " + a + ", " + b + ", " + c + ".");
        System.out.println("The perimeter of the triangle is: " + perimeter);
        System.out.println("The area of the triangle is: " + area);

    } //main method
} //Triangle1 class

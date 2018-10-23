import java.util.Scanner;

public class TwoSixteen {

    public static void main(String[] args) {

        //Create Scanner
        Scanner input = new Scanner(System.in);

        //Get a side from user
        System.out.println("Enter the side: ");

        double side = input.nextDouble();

        //Calculate area
        double area = ((3 * Math.sqrt(3)) / 2) * Math.pow(side, 2);

        //Show result
        System.out.println("The area of the hexagon is " + area);
    }
}

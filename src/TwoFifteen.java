import java.util.Scanner;

public class TwoFifteen {

    public static void main(String[] args) {

        //Create scanner
        Scanner input = new Scanner(System.in);

        //Get x1, y1 and x2, y2
        System.out.println("Enter x1 and y1: ");

        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.println("Enter x2 and y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        //Calculate a
        double a = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);

        //Get result
        double result = Math.pow(a, 0.5);

        System.out.println("The distance between the two points is " + result);
    }
}

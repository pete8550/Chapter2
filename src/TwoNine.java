import java.util.Scanner;

public class TwoNine {

    public static void main(String[] args) {

        //Create Scanner
        Scanner input = new Scanner(System.in);

        //Get v0, v1 and t
        System.out.println("Enter v0, v1, and t: ");

        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();

        //Calculate average acceleration
        double a = (v1 - v0) / t;

        System.out.println("The average acceleration is " + a);
    }
}

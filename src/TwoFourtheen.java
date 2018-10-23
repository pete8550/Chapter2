import java.util.Scanner;

public class TwoFourtheen {

    public static void main(String[] args) {

        //Create scanner
        Scanner input = new Scanner(System.in);

        //Get weight in pounds and height in inches
        System.out.println("Enter weight in pounds: ");
        double WEIGHT_IN_POUNDS = input.nextDouble();

        System.out.println("Enter height in inches: ");
        double HEIGHT_IN_INCHES = input.nextDouble();

        //Calulate kilograms and meters
        double kilograms = WEIGHT_IN_POUNDS * 0.45359237;

        double meters = HEIGHT_IN_INCHES * 0.0254;

        //Calculate BMI
        double BMI = kilograms / (meters*meters);

        System.out.println("BMI is " + BMI);
    }
}

import java.util.Scanner;

public class TwoTwentythree {

    public static void main(String[] args) {

        //Create scanner
        Scanner input = new Scanner(System.in);

        //Get info
        System.out.println("Enter the driving distance: ");
        double distance = input.nextDouble();

        System.out.println("Enter miles per gallon: ");
        double MILES_PER_GALLON = input.nextDouble();

        System.out.println("Enter price per gallon: ");
        double PRICE_PER_GALLON = input.nextDouble();

        //Calculate the cost of driving
        double COD = (distance / MILES_PER_GALLON) * PRICE_PER_GALLON;
        System.out.println("The cost of driving is $ " + COD);
    }
}

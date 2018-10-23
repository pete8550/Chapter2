import java.util.Scanner;

public class TwoSeventeen {

    public static void main(String[] args) {

        //Create scanner
        Scanner input = new Scanner(System.in);

        //Get info
        System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double temperature = input.nextDouble();

        System.out.println("Enter the wind speed (>=2) in miles per hour: ");
        double wind = input.nextDouble();

        //Calculate Wind Chill Index
        double WCI = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(wind, 0.16) +
                0.4275 * temperature * Math.pow(wind, 0.16);

        //Show result
        System.out.println("The wind chill index is " + WCI);
    }
}

import java.util.Scanner;

public class TwoTen {

    public static void main(String[] args) {

        //Create scanner
        Scanner input = new Scanner(System.in);

        //Get info
        System.out.println("Enter the amount of water in kilograms: ");
        double WATER_IN_KILOGRAMS = input.nextDouble();

        System.out.println("Enter the initial temperature: ");
        double INITIAL_TEMPERATURE = input.nextDouble();

        System.out.println("Enter the final temperature: ");
        double FINAL_TEMPERATURE = input.nextDouble();

        double ENERGY_IN_JOULE = WATER_IN_KILOGRAMS * (FINAL_TEMPERATURE - INITIAL_TEMPERATURE) * 4184;

        System.out.println("The energy needed is " + ENERGY_IN_JOULE);
    }
}

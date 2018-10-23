import java.util.Scanner;

public class TwoThree {

    public static void main(String[] args) {

        //Create scanner
        Scanner input = new Scanner(System.in);

        //Get meters
        System.out.println("Enter a value for meters: ");

        double meter = input.nextDouble();

        //Convert meters to feet
        double feet = meter * 3.2786;

        System.out.println(meter + " meters is " + feet + " feet");
    }
}

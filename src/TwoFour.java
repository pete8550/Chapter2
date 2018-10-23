import java.util.Scanner;

public class TwoFour {

    public static void main(String[] args) {

        //Create scanner
        Scanner input = new Scanner(System.in);

        //Get square meters
        System.out.println("Enter a number in square meters: ");

        double SMeters = input.nextDouble();

        //Convert to ping
        double ping = SMeters * 0.3025;

        System.out.println(SMeters + " square meters is " + ping + " pings");
    }
}

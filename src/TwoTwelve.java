import java.util.Scanner;

public class TwoTwelve {

    public static void main(String[] args) {

        //Create Scanner
        Scanner input = new Scanner(System.in);

        //Get speed and acceleration
        System.out.println("Enter speed and acceleration: ");

        double speed = input.nextDouble();
        double acceleration = input.nextDouble();
        double velocity = (double) (Math.pow(speed, 2));
        double lenght = velocity / (2*(acceleration));

        System.out.println("The minimum runway lenght for this airplane is " + lenght);
    }
}

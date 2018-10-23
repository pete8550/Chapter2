import java.util.Scanner;

public class TwoSeven {

    public static void main(String[] args) {

        //Create Scanner
        Scanner input = new Scanner(System.in);

        //Get number of minutes
        System.out.println("Enter the number of minutes: ");

        double minutes = input.nextDouble();

        //Convert minutes to years and days
        double years = minutes / 525600;

        double RMinutes = minutes % 525600; //Get remaining minutes

        double days = RMinutes / 1440;

        System.out.println(minutes + " is approximately " + years + " years and " + days + " days");
    }
}



import java.util.Scanner;

public class TwoOne {

    public static void main(String[] args) {

        //Create a Scanner
        Scanner input = new Scanner(System.in);

        //Recieve number of miles
        System.out.println("Enter Miles: ");

        double miles = input.nextDouble();

        //Convert miles to kilometres
        double kilometer = miles * 1.6;

        //Print result
        System.out.println(miles + " miles is " + kilometer + " kilometres");
    }
}

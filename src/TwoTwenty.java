import java.util.Scanner;

public class TwoTwenty {

    public static void main(String[] args) {

        //Create scanner
        Scanner input = new Scanner(System.in);

        //Get balance and interest rate
        System.out.println("Enter balance and interest rate (e.g., 3 for 3%): ");
        double balance = input.nextDouble();
        double ir = input.nextDouble();

        //Calculate interest
        double interest = balance * (ir/1200);
        System.out.println("The interest is " + interest);
    }
}

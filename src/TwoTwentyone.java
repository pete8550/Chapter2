import java.util.Scanner;

public class TwoTwentyone {

    public static void main(String[] args) {

        //Create scanner
        Scanner input = new Scanner(System.in);

        //Get info
        System.out.println("Enter investment amount: ");
        double investmentAmount = input.nextDouble();

        System.out.println("Enter annual interes trate in percentage: ");
        double interestRate = input.nextDouble();
        interestRate /= 1200;

        System.out.println("Enter number of years: ");
        double years = input.nextDouble();

        //Calculate accumulated value
        double futureInvestmentValue = investmentAmount * Math.pow(1 + interestRate, years*12);

        System.out.println("Accumulated value is " + futureInvestmentValue);
    }
}

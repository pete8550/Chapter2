import java.util.Scanner;

public class TwoThirteen {

    public static void main(String[] args) {

        //Create scanner
        Scanner input = new Scanner(System.in);

        //Get amount
        System.out.println("Enter the monthly saving amount: ");

        double amount = input.nextDouble();

        //Get monthly interest rate
        double interestRate = (1 + 0.003125);

        //Get account value
        double value1 = amount * interestRate;
        System.out.println("After the first month, the account value is " + value1);

        double value2 = (amount + value1) * interestRate;
        System.out.println("After the second month, the account value is " + value2);

        double value3 = (amount + value2) * interestRate;
        System.out.println("After the third month, the account value is " + value3);

        double value4 = (amount + value3) * interestRate;

        double value5 = (amount + value4) * interestRate;

        double value6 = (amount + value5) * interestRate;
        System.out.println("After the sixth month, the account value is " + value6);
    }
}

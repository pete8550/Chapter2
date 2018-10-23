import java.util.Scanner;

public class TwoFive {

    public static void main(String[] args) {

        //Create scanner
        Scanner input = new Scanner(System.in);

        //Get subtotal and gratuity rate
        System.out.println("Enter the subtotal and a gratuity rate: ");

        double subtotal = input.nextDouble();
        double GR = input.nextDouble();

        //Calculate gratuity
        double gratuity = (GR / 100) * subtotal;

        //Calculate total
        double total = gratuity + subtotal;

        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
    }
}

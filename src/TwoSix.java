import java.util.Scanner;

public class TwoSix {

    public static void main(String[] args) {

        //Create Scanner
        Scanner input = new Scanner(System.in);

        //Get integer
        System.out.println("Enter a number between 0 and 1000: ");

        int number = input.nextInt();

        //Extract numbers
        int n1 = number % 10;
        int nn1 = number / 10; //Get new number

        int n2 = nn1 % 10;
        int nn2 = nn1 / 10; //Get new number

        int n3 = nn2 % 10;

        //Calculate everything
        int result = n1 * n2 * n3;

        System.out.println("The multiplication between all digits in " + number + " is " + result);
    }
}

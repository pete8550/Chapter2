import java.util.Scanner;

public class TwoTwo {

    public static void main(String[] args) {

        //Create a scanner
        Scanner input = new Scanner(System.in);

        //Recieve lenght and height
        System.out.println("Enter lenght of the sides and height of the Equilateral triangle: ");

        double lenght = input.nextDouble();

        //Calculate area
        double area = Math.sqrt(3)/4*Math.pow(lenght, 2);

        //Calculate volume
        double volume = area * lenght;

        System.out.println("The area is: " + area);
        System.out.println("The volume of the Triangular prism is: " + volume);
    }
}

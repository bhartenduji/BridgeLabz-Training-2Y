import java.util.Scanner;

public class KmToMilesScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble();

        // Convert km to miles
        double miles = km / 1.6;

        // Output
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");

        input.close();
    }
}



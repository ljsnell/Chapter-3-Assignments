import java.util.Scanner;

public class PaintCalculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter Wall Width:");
        int wallWidth = keyboard.nextInt();
        System.out.println("Enter Wall Length:");
        int wallLength = keyboard.nextInt();
        System.out.println("Enter Wall Height:");
        int wallHeight = keyboard.nextInt();

        int calculatedPrice = calculateWallArea(wallWidth, wallLength, wallHeight);

        System.out.println("Your total cost is: $" + calculatedPrice);
    }

    public static int calculateWallArea(int wallWidth, int wallLength, int wallHeight) {
        final int PRICE_PER_GALLON = 32;

        int wallArea = ((wallLength * wallHeight) * 2) + ((wallWidth * wallHeight) * 2);
        int gallons = calculateNumberOfGallonsNeeded(wallArea);

        System.out.println("You need: " + gallons + " gallons");

        return gallons * PRICE_PER_GALLON;
    }

    public static int calculateNumberOfGallonsNeeded(int wallArea) {
        final int FEET_PER_GALLON = 350;
        return wallArea / FEET_PER_GALLON;
    }
}

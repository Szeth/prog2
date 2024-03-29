import java.util.Scanner; // Needed for the Scanner class

public class MakeChange
{
    public static void main(String[] args)
    {
        // Declare variables
        int purchaseAmount;
        int change;
        int quarters, dimes, nickels, pennies;

        // Create a scanner object for user input
        Scanner keyboard = new Scanner(System.in);

        // Ask for the purchase amount and store it in puchaseAmount
        System.out.print("Enter your total puchase ammount (dollars): ");
        purchaseAmount = keyboard.nextInt();
        
        // Handle invalid input (hint, use a while loop)
		while( purchaseAmount < 1 )
        {
			System.out.print("Error");
			System.out.print("Enter your total puchase ammount (dollars): ");
			purchaseAmount = keyboard.nextInt();
        }
        
        // Make change
		change = 100 - purchaseAmount;

        // Output the amount of change
		System.out.println("Change: " + change);
        
        // Find how many quarters go into the change
        quarters = change / 25;
        
        
        // Find the remainder after removing the quarters
        change = change%25;

        
        // Find how many dimes go into what's left
        dimes = change / 10;
        
        
        // Find the remainder after removing the dimes
        change = change%10;

        
        // Find how many nickels go into what's left
        nickels = change / 5;
        
        
        // Find the remainder after removing the nickels
        change = change%5;

        
        // Leftovers are pennies
        pennies = change / 1;

        
        // Output the results
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");

    }
}

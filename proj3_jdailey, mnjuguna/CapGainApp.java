import java.util.Scanner;

/**
 * class contains the main method that 
 * creates a new CapGain object cg
 * and a new Scanner object
 */

public class CapGainApp {


	/**
	 * gets numshares amount  
	 * and the price from user 
	 * then calls cg to evaluate 
	 * gain /loss 
	 */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		CapGain cg = new CapGain();
		
		do { 
			//show menu, get user choice
			cg.mainMenuPrompt();
			int choice = in.nextInt();
			
			//buy
			if (choice == 1) {
				//prompt user for shares and price
				System.out.print("Number of Shares: ");
				int shares = in.nextInt();
				System.out.print("Price: ");
				double price = in.nextDouble();
				
				cg.buy(shares, price);
				
			//sell
			} else if (choice == 2) {
				//prompt user for shares and price
				System.out.print("Number of Shares: ");
				int shares = in.nextInt();
				System.out.print("Price: ");
				double price = in.nextDouble();
				
				cg.sell(shares, price);
				
			//show gain	
			} else if (choice == 3) {
				System.out.printf("Total gain: $%.2f\n", cg.getTotalGain());
				
			//exit	
			} else if (choice == 4) {
				System.out.println("Goodbye!");
				break;
			}
			
			System.out.println();
			
		//loop indefinitely until quit is chosen
		} while (true);

		in.close();
	}

}
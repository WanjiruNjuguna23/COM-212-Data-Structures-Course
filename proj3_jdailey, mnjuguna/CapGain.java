

/**
 * contains the main method that
 * prints out command lines and take 
 * input from user 
 */
public class CapGain {

	private double totGain = 0;
	private Queue<Double[]> sharesHeld = new Queue<Double[]>();
	
	/**
	 * The main method that
	 * prints out the menu and prompts
	 */
	public void mainMenuPrompt() {
		System.out.println("1. Buy");
		System.out.println("2. Sell");
		System.out.println("3. Total Gain So Far");
		System.out.println("4. Quit");
		System.out.print("Command (1-4)? ");
	}


     
     /**
      * adds numshares aand price to the queue
      */
	public void buy(int numShares, double price) {
		//info is stored as a pair of numbers, the number of shares and the price
		sharesHeld.enqueue(new Double[] {(double)numShares, price});
	}
	


	/**
	 * Removes numshares from the queue
	 * and calculates gain/loss for
	 * each share taking into consideration the price
	 * it was bought at and price it is being sold for
	 * updates totCapGain to reflect the changes
	 */
	public void sell(int numShares, double price) {
		
		//while we want to sell and there are shares to sell
		while (numShares > 0 && !sharesHeld.isEmpty()) {
			//get the front of the queue
			Double[] shares = sharesHeld.peek();
			
			//get the number of available shares
			int available = (int) (double) shares[0];

			//if more than enough
			if (available > numShares) {
				//subtract from the number of shares
				shares[0] -= numShares;
				//compute and add gain
				totGain += (price-shares[1]) * numShares;
				//we sold all we wanted to sell
				numShares = 0;
			} else {
				//remove the front of queue
				sharesHeld.dequeue();
				//compute and add gain
				totGain += (price-shares[1]) * available;
				//reduce the shares we want to sell by the amount we sold
				numShares -= available;
			}
		}
		 
	}

    

    /**
     * @return total gain/loss after 
     * removing shares from the queue
     */
	public double getTotalGain() {
		return totGain;
	}
	
}
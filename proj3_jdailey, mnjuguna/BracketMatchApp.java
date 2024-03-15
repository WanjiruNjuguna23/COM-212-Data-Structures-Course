import java.util.Scanner; 

/**
 * This project allows user input to enter
 * any number of brackets, and checks if 
 * these brackets are balanced or unbalanced 
 */

public class BracketMatchApp {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter string: ");
		String brackets = input.nextLine();

		BracketMatcher test = new BracketMatcher(); 
		System.out.println(brackets);
		if(test.checkBrackets(brackets)){
			System.out.println("Brackets are balanced"); 
		}
		else{
			System.out.println("Brackets are not balanced"); 
		}

	}

}



	
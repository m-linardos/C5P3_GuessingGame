
public class F_Ch5_Proj3_GuessingGameApp {

	public static void main(String[] args) {

		Console.printWelcome();
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			int rand = (int)(Math.random()*100+1);
			
			int counter = 0;
			boolean isAWinner = false;
			
			while (isAWinner == false) {
				int guess = Console.getIntWithinRange("Enter #: " , 0, 101);
				counter++;
				
				if (guess == rand) {
				System.out.println("u win!");	
				isAWinner = true;				
				}
				else if (guess < rand && guess >= rand-10) {
					System.out.println("Close, but too low.");				
				}	
				else if (guess < rand) {
					System.out.println("Too Low.  You'r a loser!!");
				}
						
				else if (guess > rand && guess <= rand +10) {
					System.out.println("Close, but too high.");
				}
				else if (guess > rand) {
					System.out.println("Too high, you are stupid!!");
				}
			}
			
			if (counter <= 3) {
				System.out.println("You are a mathematical wizard!!! You guessed it in " + counter + " guesses.");
				
			}	
			else if (counter > 3 && counter <= 7) {
				System.out.println("Not too bad, you won in " + counter + " guesses!!!");
			}
			else if (counter >  7) {
				System.out.println("Nawww mannn... you got it all wrong.  Go back to Kindergarten."
						+ "You won in " + counter + " guesses!!!");
			}
			
			choice = Console.getChoiceString("Continue (y/n): ", "y", "n");		
				
			
				
				
		}
		
		System.out.println("Bye");
		
		
		
		
		 
	}
}
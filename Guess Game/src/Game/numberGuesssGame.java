package Game;
import java.util.Scanner;
public class numberGuesssGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	int randomNumber = (int) (Math.random() * 100) + 1;
		
		boolean hasWon = false;
		System.out.println("I have chosen a number between 1 - 100");
		System.out.println("Try to guess it ");
		
		
	
		for(int i = 10 ; i>= 0 ; i--) {
			System.out.println("You have " + i + " guesse's left to guess the number");
			
	
		int guess = sc.nextInt();
		
		if(randomNumber < guess) {
			System.out.println("It is smaller than "+guess+".");
		}
		
		if(randomNumber > guess) {
			System.out.println("It is larger than "+guess+".");
		}
		if(randomNumber == guess) {
			hasWon = true;
			break;
		}
		
		}
		
		if(hasWon) {
			System.out.println("Correct...... You win the game");
		} else {
			System.out.println("Game Over You lose..............");
			System.out.println("The number was " + randomNumber);
		}
		
	}
	
}
